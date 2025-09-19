package skillbuilder;

import java.util.Scanner;

public class Rectangle_Perimeter 
{

	public static void main(String[] args) 
	{
		// Declare variable
		int width;
		int length;
		
		// Create Scanner object
		Scanner input = new Scanner (System.in);
		
		//Get different types of input 
		System.out.print("Enter a width: ");
		width = input.nextInt();
		System.out.print("Enter a length: ");
		length = input.nextInt();
		
		//Print out the input's
		System.out.println("The width is:" + width);
		System.out.print("The length is:" + length);
		
		
	}

}
