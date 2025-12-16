package gettingstarted;

//Add Phidgets Library 
import com.phidget22.*;

public class GettingstartedGreen {
    //Handle Exceptions | Exceptions will happen in your code from time to time.
    public static void main(String[] args) throws Exception{

        //Create | Here you've created a DigitalOutput object for your LED.
        DigitalOutput greenLED = new DigitalOutput();

        //Address | This tells your program where to find the device you want to work with. 
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Open establishes a connection between your object and your physical Phidget. 
        //You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget.
        greenLED.open(1000);

        //Use your Phidgets | You can turn your LED on/off by setting the state to true/false. 
        //The sleep command keeps your LED on by letting 1000 milliseconds pass before turning the LED off.
        while(true){
        	greenLED.setState(true); //ON
            Thread.sleep(1000);
            greenLED.setState(false); //OFF
            Thread.sleep(1000);
        }
    }
}
  