package mastery;

import java.util.Scanner;

//Author: Matthew 
//School: CHHS
//Course: Computer Programming 20

public class HiLo {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tokens = 1000;  
        boolean playAgain = true;
        
        System.out.println("Welcome to the Hi-Lo Game!");
        System.out.println("You start with " + tokens + " tokens.");
        // Prompt a bet amount
        while (playAgain && tokens > 0) {
        	System.out.print("Enter your bet amount: ");
            int bet = input.nextInt();  
            // validate bet
            if (bet > tokens || bet <= 0) {
                System.out.println("Invalid bet amount. Try again.");
                continue;
            }
            // Prompt if the number is high or low
            System.out.print("Will the next number be (H)igher or (L)ower?: ");
            char guess = input.next().toUpperCase().charAt(0);
            
            // generate a random number between 1–13
            int number = (int) (Math.random() * 13) + 1;
            System.out.println("The number is: " + number);
            
            // Determine if it's high, low, or neutral, then Adds or subtract your total 
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
            // tell you your ended tokens
            System.out.println("You now have " + tokens + " tokens.");
            
            // End the game when your out of tokens
            if (tokens <= 0) {
                System.out.println("You're out of tokens! Game over.");
                break;
            }
            
            // Prompt if you want to play again?
            System.out.print("Play again? (Y/N): ");
            playAgain = input.next().equalsIgnoreCase("Y");
        }
        // closes and tell you your  ended tokens
        System.out.println("Thanks for playing! You ended with " + tokens + " tokens.");
        input.close();
    }
}

/* 
 Welcome to the Hi-Lo Game!
You start with 1000 tokens.
Enter your bet amount: 250
Will the next number be (H)igher or (L)ower?: h
The number is: 9
You guessed correctly! You win 250 tokens!
You now have 1250 tokens.
Play again? (Y/N): Y
Enter your bet amount: 450
Will the next number be (H)igher or (L)ower?: l
The number is: 3
You guessed correctly! You win 450 tokens!
You now have 1700 tokens.
Play again? (Y/N): y
Enter your bet amount: 600
Will the next number be (H)igher or (L)ower?: l
The number is: 2
You guessed correctly! You win 600 tokens!
You now have 2300 tokens.
Play again? (Y/N): y
Enter your bet amount: 2000
Will the next number be (H)igher or (L)ower?: h
The number is: 6
Wrong guess! You lose 2000 tokens.
You now have 300 tokens.
Play again? (Y/N): n
Thanks for playing! You ended with 300 tokens.
 */
