package mastery;

import java.util.Scanner;

public class HiLo {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tokens = 1000;  
        boolean playAgain = true;

        System.out.println("Welcome to the Hi-Lo Game!");
        System.out.println("You start with " + tokens + " tokens.");

        while (playAgain && tokens > 0) {
        	System.out.print("Enter your bet amount: ");
            int bet = input.nextInt();  
            
            if (bet > tokens || bet <= 0) {
                System.out.println("Invalid bet amount. Try again.");
                continue;
            }

            System.out.print("Will the next number be (H)igher or (L)ower?: ");
            char guess = input.next().toUpperCase().charAt(0); 

            int number = (int) (Math.random() * 13) + 1;
            System.out.println("The number is: " + number);
            
            if (number >= 8 && guess == 'H') {
                System.out.println("You guessed correctly! You win " + bet + " tokens!");
                tokens += bet;
            } else if (number <= 6 && guess == 'L') {
                System.out.println("You guessed correctly! You win " + bet + " tokens!");
                tokens += bet;
            } else if (number == 7) {
                System.out.println("The number is 7 — it's neutral. No tokens gained or lost.");
            } else {
                System.out.println("Wrong guess! You lose " + bet + " tokens.");
                tokens -= bet;
            }

            System.out.println("You now have " + tokens + " tokens.");

            if (tokens <= 0) {
                System.out.println("You're out of tokens! Game over.");
                break;
            }

            System.out.print("Play again? (Y/N): ");
            playAgain = input.next().equalsIgnoreCase("Y");
        }

        System.out.println("Thanks for playing! You ended with " + tokens + " tokens.");
        input.close();
    }
}
