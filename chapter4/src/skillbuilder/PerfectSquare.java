package skillbuilder;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a integer: ");
		int number = input.nextInt();
		
		double squareRoot = Math.sqrt(number);
		
		int intRoot = (int) squareRoot;
		
		int square = intRoot * intRoot;
		
		if (square == number) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

		
	}

}
