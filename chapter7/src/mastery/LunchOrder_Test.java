package mastery;

import java.util.Scanner;

public class LunchOrder_Test {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int quantity;
		double orderTotal = 0;
		
		LunchOrder hamburger = new LunchOrder("Hamburger", 1.85, 9, 33, 1);
	   
	    //process hamburger orders 
		System.out.print("Enter number of hamburgers: ");
		quantity = input.nextInt();
		orderTotal += quantity* hamburger.getPrice();
		System.out.print("Each hamburger has " + hamburger.getFat() + "g of fat, ");
		System.out.print(hamburger.getCarbohydrates() + "g of carbs, and ");
		System.out.println(hamburger.getFiber() + "g of fiber.\n");
	   
	   
		LunchOrder salad = new LunchOrder("Salad", 2.00, 1, 11, 5);
		//process salad orders 
		System.out.print("Enter number of salads: ");
		quantity = input.nextInt();
		orderTotal += quantity* salad.getPrice();
		System.out.print("Each salad has " + salad.getFat() + "g of fat, ");
		System.out.print(salad.getCarbohydrates() + "g of carbs, and ");
		System.out.println(salad.getFiber() + "g of fiber.\n");
		
		LunchOrder french_fries = new LunchOrder("French fries", 1.30, 11, 36, 4);
		//process french_fries orders 
		System.out.print("Enter number of french fries: ");
		quantity = input.nextInt();
		orderTotal += quantity* french_fries.getPrice();
		System.out.print("Each french fries has " + french_fries.getFat() + "g of fat, ");
		System.out.print(french_fries.getCarbohydrates() + "g of carbs, and ");
		System.out.println(french_fries.getFiber() + "g of fiber.\n");
		
		LunchOrder soda = new LunchOrder("Soda", 0.95, 0, 38, 0);
		//process soda orders 
		System.out.print("Enter number of Sodas: ");
		quantity = input.nextInt();
		orderTotal += quantity* soda.getPrice();
		System.out.print("Each Soda has " + soda.getFat() + "g of fat, ");
		System.out.print(soda.getCarbohydrates() + "g of carbs, and ");
		System.out.println(soda.getFiber() + "g of fiber.\n");
		
	
		System.out.printf("\nTotal Price: $%.2f\n", orderTotal);
        
    }
}