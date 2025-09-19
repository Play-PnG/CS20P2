package skillbuilder;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) 
	{
		//Create a Scanner object 
		Scanner input = new Scanner(System.in);
		
		//Get digits from user 
		System.out.print("Enter two digit number: ");
		int number = input.nextInt();
		int tens, ones;
		
		tens = number /10;
		ones = number %10;
		
		//Print out the numbers
		System.out.print("Tens = "+ tens);
		System.out.print(" Ones = "+ ones);
	}

}
