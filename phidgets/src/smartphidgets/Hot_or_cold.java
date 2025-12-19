package smartphidgets;

//Add Phidgets Library
import com.phidget22.*;

public class Hot_or_cold {
	public static void main(String[] args) throws Exception{
		
		//Create | Here you have created a TemperatureSensor object.
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        //Address | Address your four objects which lets your program know where to find them.
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open | Connect your program to your physical devices.
        temperatureSensor.open(1000);
        redLED.open(1000);
        greenLED.open(1000);
        
        //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
        while(true){
        	
        	double temperature = temperatureSensor.getTemperature();
        	
        	 if (temperature >= 20 && temperature <= 24) {
        	        greenLED.setState(true);
        	        redLED.setState(false);
        	        System.out.println("Temperature: " + temperature + " °C");
        	    } else {
        	        greenLED.setState(false);
        	        redLED.setState(true);
        	        System.out.println("Temperature: " + temperature + " °C");
        	    }

            Thread.sleep(150);
        }
	}
}
