package smartphidgets;

//Add Phidgets Library 
import com.phidget22.*;

public class ReadTempHumi {
	public static void main(String[] args) throws Exception{
	
        //Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget.
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Connect your program to your physical devices.
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
        while(true){
        	
        	double humidity = humiditySensor.getHumidity();
        	double temperature = temperatureSensor.getTemperature();
        	
        	// Humidity check
            if (humidity > 30) {
                System.out.println("Humidity: " + humidity + " %RH");
            } else {
                System.out.println("Humidity is low");
            }
            
            // Temperature check 
            if (temperature > 21) {
                System.out.println("Temperature: " + temperature + " °C");
            } else {
                System.out.println("Room is too cold");
            }

            Thread.sleep(150);
        }
    }
}
  
