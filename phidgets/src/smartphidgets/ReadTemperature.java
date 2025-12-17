package smartphidgets;

//Add Phidgets Library
import com.phidget22.*;

public class ReadTemperature {
    public static void main(String[] args) throws Exception{

        //Create | Here you have created a TemperatureSensor object
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Connect your program to your physical devices.
        temperatureSensor.open(1000);

        //Use your Phidgets | This code will print the temperature every 150ms
        while (true) {
        	
            double celsius = temperatureSensor.getTemperature();
            double fahrenheit = (celsius * 1.8) + 32;

            System.out.println("Temperature: " + fahrenheit + " °F");
            Thread.sleep(150);
        }
    }
}
  
