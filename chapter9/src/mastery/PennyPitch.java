package mastery;

import java.util.Random;

public class PennyPitch {

	public static void main(String[] args) {
	
		// A 5x5 board 
        String[] board = new String[25];

        // Fill board with empty marker
        for (int i = 0; i < board.length; i++) {
            board[i] = "-";
        }

        // Prizes
        String[] prizes = {"Bear", "GameBoy", "Ball", "Poster", "Keychain"};
        Random rand = new Random();

        int totalPrizes = 15;
        int placed = 0;

        // Randomly place 15 prizes 
        while (placed < totalPrizes) {
            int pos = rand.nextInt(25);
            String prize = prizes[rand.nextInt(prizes.length)];

            if (board[pos].equals("-")) {
                board[pos] = prize;
                placed++;
            }
        }

        // Display board
        System.out.println("=== Penny Pitch Board ===");
        for (int i = 0; i < board.length; i++) {
            System.out.print("[" + board[i] + "] ");
            if ((i + 1) % 5 == 0) System.out.println();
        }

        // Count prizes won
        int[] prizeCounts = new int[prizes.length];

        System.out.println("\n=== Penny Tosses ===");

        // Simulate 10 penny throws
        for (int toss = 1; toss <= 10; toss++) {
            int spot = rand.nextInt(25);
            String landedOn = board[spot];

            System.out.print("Penny " + toss + " landed on square " +
                    spot + " which has: " + landedOn);

            if (!landedOn.equals("-")) {
                System.out.println(" → You won a " + landedOn + "!");

                // Find which prize it is
                for (int i = 0; i < prizes.length; i++) {
                    if (landedOn.equals(prizes[i])) {
                        prizeCounts[i]++;
                    }
                }
            } else {
                System.out.println(" → No prize.");
            }
        }

        // Show results
        System.out.println("\n=== Prizes You Won ===");
        for (int i = 0; i < prizes.length; i++) {
            System.out.println(prizes[i] + ": " + prizeCounts[i]);
        }
    }
}