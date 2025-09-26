package mastery;

import java.util.Scanner;

public class Energy {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		
		final double c = 3.0e8;
		final double bulbPower = 100.0;
		
		System.out.print("Enter mass in kilograms: ");
        double mass = input.nextDouble();
        
        double energy = mass * Math.pow(c, 2);
        
        double numBulbs = energy / bulbPower;
        
        System.out.printf("If the energy produced is: %.3e joules%n", energy);
        System.out.printf("That could power " + numBulbs + " 100W lightbulbs for 1 second!");
	}

}
