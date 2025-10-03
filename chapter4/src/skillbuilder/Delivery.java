package skillbuilder;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please the length of the package: ");
		double length = input.nextDouble();
		
		System.out.print("Please the width of the package: ");
		double width = input.nextDouble();
		
		System.out.print("Please the height of the package: ");
		double height = input.nextDouble();
		
		if (length <= 10 && width <= 10 && height <= 10) {
            System.out.println("\nPackage Accepted.");
        
		 } else {
			 System.out.println("\nPackage Rejected: dimensions are greater than 10.");
		 }
		
		
	}

}
