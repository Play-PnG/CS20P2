package skillbuilder;

import java.util.Scanner;
import java.util.Random;

public class RandomNum {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Please enter your first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Please enter your second number: ");
		int num2 = input.nextInt();
		
		int min = Math.min(num1, num2);
	    int max = Math.max(num1, num2);
	    
	    int randomNum = rand.nextInt((max - min) + 1) + min;
		
	    System.out.println("If your numbers are " + min + " and " + max + ", your number is: " + randomNum);

	}

}
