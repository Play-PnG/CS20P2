package skillbuilder;

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine().toLowerCase(); 

        int[] counts = new int[26]; // A-Z

        
        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);

            
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                counts[index]++;
            }
        }

        
        System.out.println("\nLetter counts:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                char letter = (char) ('a' + i);
                System.out.println(letter + ": " + counts[i]);
            }
        }
    }
}