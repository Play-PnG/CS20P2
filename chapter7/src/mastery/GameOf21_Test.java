package mastery;

import java.util.Random;
import java.util.Scanner;

public class GameOf21_Test {

	public static GameOf21 dealCard() 
	{
	    return new GameOf21(); // value is random automatically
	}

    // Adds a card to a total, fixing Aces
    public static int addCardToTotal(int total, GameOf21 card, int aceCount[]) {
        total += card.getRawValue();

        // Count aces
        if (card.isAce()) {
            aceCount[0]++;
        }

        // If over 21, convert an Ace from 11 → 1 by subtracting 10
        while (total > 21 && aceCount[0] > 0) {
            total -= 10;
            aceCount[0]--;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        boolean playAgain = true;

        while (playAgain) {

        int userTotal = 0;
        int compTotal = 0;

        int[] userAces = {0};     // Keeps track of how many usable Aces
        int[] compAces = {0};

        System.out.println("=== Welcome to 21 ===");

        //USER TURN
        while (true) {
            System.out.println("\nYour total: " + userTotal);
            System.out.print("Hit or Stand? (h/s): ");
            String choice = input.nextLine().toLowerCase();

            if (choice.equals("h")) {
            	GameOf21 card = dealCard();
                System.out.println("You drew: " + card);

                userTotal = addCardToTotal(userTotal, card, userAces);

                if (userTotal > 21) {
                    System.out.println("You bust!");
                    break;
                }
            }
            else if (choice.equals("s")) {
                break;
            }
            else {
                System.out.println("Invalid choice.");
            }
        }


        //COMPUTER TURN 
        if (userTotal <= 21) {
            System.out.println("\nComputer's turn...");

            while (compTotal < 16) {
            	GameOf21 card = dealCard();
                System.out.println("Computer drew: " + card);

                compTotal = addCardToTotal(compTotal, card, compAces);
            }
        }


        //RESULTS
        System.out.println("\n=== Final Totals ===");
        System.out.println("Your total: " + userTotal);
        System.out.println("Computer total: " + compTotal);

        if (userTotal > 21) {
            System.out.println("Computer wins!");
        } else if (compTotal > 21) {
            System.out.println("You win!");
        } else if (userTotal > compTotal) {
            System.out.println("You win!");
        } else if (compTotal > userTotal) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("It's a tie!");
        }

     // Ask if you want to play again
        System.out.print("Do you want to play again? (y/n): ");
        String answer = input.next();

        if (!answer.equalsIgnoreCase("y")) {
            playAgain = false;
            System.out.println("Thanks for playing!");
        }
        
       }
    }
}