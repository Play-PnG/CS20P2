
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
        while(true){

            if( redButton.getState()){
            	greenLED.setState(true);
            } else {
            	greenLED.setState(false);
            }

            if(greenButton.getState()){
            	redLED.setState(true);
            } else {
            	redLED.setState(false);
            }

            Thread.sleep(150);
        }
    }
}
  