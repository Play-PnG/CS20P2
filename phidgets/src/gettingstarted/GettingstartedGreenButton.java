package gettingstarted;

//Add Phidgets Library 
import com.phidget22.*;

public class GettingstartedGreenButton {
	 //Handle Exceptions | Exceptions will happen in your code from time to time.
  public static void main(String[] args) throws Exception{
      
      //Create | Here you've created a DigitalOutput object for your button.
      DigitalInput greenButton = new DigitalInput();

      //Address | This tells your program where to find the device you want to work with.
      greenButton.setHubPort(5);
      greenButton.setIsHubPortDevice(true);

      //Open | Open establishes a connection between your object and your physical Phidget. 
      //You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget.
      greenButton.open(1000);

      //Use your Phidgets | This code checks the state of the button and prints true/false when the button is pressed/released. 
      //The sleep function means the button state is only checked every 150 milliseconds. Sleeping is used to make it easier to read the console output 
      while(true){
          System.out.println("Button State: " + greenButton.getState());
          Thread.sleep(150);
      }
   }
}