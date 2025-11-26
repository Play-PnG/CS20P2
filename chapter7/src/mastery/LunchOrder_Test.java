package mastery;

import java.util.ArrayList;
import java.util.Scanner;

public class LunchOrder_Test {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		LunchOrder[] menu = {
	    new LunchOrder("Hamburger", 1.85, 9, 33, 1),
	    new LunchOrder("Salad", 2.00, 1, 11, 5),
	    new LunchOrder("French fries", 1.30, 11, 36, 4),
	    new LunchOrder("Soda", 0.95, 0, 38, 0),
		};     
	        
		// Show menu
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].toString());
        }

        ArrayList<LunchOrder> order = new ArrayList<>();

        int choice = -1;

        System.out.println("\nEnter the item number to add to your order.");
        System.out.println("Type 0 when you are done.\n");

        //Ask until user enters 0
        while (choice != 0) {
            System.out.print("Choose an item (1-4, or 0 to finish): ");
            choice = input.nextInt();

            if (choice >= 1 && choice <= menu.length) {
                order.add(menu[choice - 1]);
                System.out.println(menu[choice - 1].getName() + " added!");
            } else if (choice != 0) {
                System.out.println("Invalid input. Try again.");
            }
        }

        // Show all items ordered
        System.out.println("\nYour Order:");
        double totalPrice = 0;

        for (LunchOrder item : order) {
            System.out.println("- " + item.getName() + " : $" + item.getPrice());
            totalPrice += item.getPrice();
        }

        // Show total price
        System.out.printf("\nTotal Price: $%.2f\n", totalPrice);
        
    }
}