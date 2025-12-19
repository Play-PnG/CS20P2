package smartphidgets;

//Add Phidgets Library
import com.phidget22.*;

public class Thermostat {
	public static void main(String[] args) throws Exception{
		//Create | Here you have created a TemperatureSensor object.
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        
        //Address | Address your four objects which lets your program know where to find them.
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        
        //Open | Connect your program to your physical devices.
        temperatureSensor.open(1000);
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);
        
        //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
        // Starting set temperature
        int setTemperature = 21;

        // Track previous button states
        boolean lastGreenState = false;
        boolean lastRedState = false;

        // Timer for printing every 10 seconds
        long lastPrintTime = System.currentTimeMillis();

        while (true) {

            double currentTemp = temperatureSensor.getTemperature();

            //GREEN BUTTON: increase set temperature 
            boolean greenState = greenButton.getState();
            if (greenState && !lastGreenState) {
                setTemperature++;
            }
            lastGreenState = greenState;

            //RED BUTTON: decrease set temperature 
            boolean redState = redButton.getState();
            if (redState && !lastRedState) {
                setTemperature--;
            }
            lastRedState = redState;

            //LED LOGIC
            if (Math.abs(currentTemp - setTemperature) <= 2) {
                greenLED.setState(true);
                redLED.setState(false);
            } else {
                greenLED.setState(false);
                redLED.setState(true);
            }

            //PRINT EVERY 10 SECONDS
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastPrintTime >= 5000) {
                System.out.println("Current Temperature: " + currentTemp + " °C");
                System.out.println("Set Temperature: " + setTemperature + " °C");
                lastPrintTime = currentTime;
            }

            Thread.sleep(150);
        }
	}
}
