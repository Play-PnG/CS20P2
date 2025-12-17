
package gettingstarted;

//Add Phidgets Library 
import com.phidget22.*;

public class GettingstartedCom {
    //Handle Exceptions | Exceptions will happen in your code from time to time.
    public static void main(String[] args) throws Exception{

        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. 
        //The sleep function slows down the loop so the button state is only checked every 150ms.
        boolean lastRedState = redButton.getState();
        boolean lastGreenState = greenButton.getState();

        // Counter for total presses
        int totalPresses = 0;

        while (true) {

            //Red Button
            boolean redState = redButton.getState();

            if (redState) {
                redLED.setState(true);
            } else {
                redLED.setState(false);
            }

            // Count red button press (false → true)
            if (redState && !lastRedState) {
                totalPresses++;
                System.out.println("Total button presses: " + totalPresses);
            }

            lastRedState = redState;

            //Green Button
            boolean greenState = greenButton.getState();

            if (greenState) {
                greenLED.setState(true);
            } else {
                greenLED.setState(false);
            }

            // Count green button press (false → true)
            if (greenState && !lastGreenState) {
                totalPresses++;
                System.out.println("Total button presses: " + totalPresses);
            }

            lastGreenState = greenState;

            Thread.sleep(150);
        }
    }
}
  