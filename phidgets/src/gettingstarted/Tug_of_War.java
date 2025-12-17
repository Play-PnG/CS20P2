package gettingstarted;

//Add Phidgets Library 
import com.phidget22.*;

public class Tug_of_War {
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
        
        // Track previous button states
        boolean lastRedState = false;
        boolean lastGreenState = false;

        // Counters
        int redCount = 0;
        int greenCount = 0;

        // Game loop
        while (true) {

            boolean redState = redButton.getState();
            boolean greenState = greenButton.getState();

            //Red button
            if (redState && !lastRedState) {
                redCount++;
                System.out.println("Red score: " + redCount);
            }

            //green button
            if (greenState && !lastGreenState) {
                greenCount++;
                System.out.println("Green score: " + greenCount);
            }

            lastRedState = redState;
            lastGreenState = greenState;

            //check the winner
            if (redCount >= 10) {

                // Flash BOTH LEDs once
                redLED.setState(true);
                greenLED.setState(true);
                Thread.sleep(500);
                redLED.setState(false);
                greenLED.setState(false);
                Thread.sleep(500);

                // Flash RED LED 5 times
                for (int i = 0; i < 5; i++) {
                    redLED.setState(true);
                    Thread.sleep(300);
                    redLED.setState(false);
                    Thread.sleep(300);
                }

                System.out.println("RED WINS!");
                break;
            }

            if (greenCount >= 10) {

                // Flash BOTH LEDs once
                redLED.setState(true);
                greenLED.setState(true);
                Thread.sleep(500);
                redLED.setState(false);
                greenLED.setState(false);
                Thread.sleep(500);

                // Flash GREEN LED 5 times
                for (int i = 0; i < 5; i++) {
                    greenLED.setState(true);
                    Thread.sleep(300);
                    greenLED.setState(false);
                    Thread.sleep(300);
                }

                System.out.println("GREEN WINS!");
                break;
            }

            Thread.sleep(150);
        }
        
    }
}
