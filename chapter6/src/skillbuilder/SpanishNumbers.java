package skillbuilder;

import java.util.Scanner;

public class SpanishNumbers {
	
		public static void displayInSpanish(int number) {
	        String spanishWord;
		 
	        switch (number) {
            case 1: spanishWord = "uno"; break;
            case 2: spanishWord = "dos"; break;
            case 3: spanishWord = "tres"; break;
            case 4: spanishWord = "cuatro"; break;
            case 5: spanishWord = "cinco"; break;
            case 6: spanishWord = "seis"; break;
            case 7: spanishWord = "siete"; break;
            case 8: spanishWord = "ocho"; break;
            case 9: spanishWord = "nueve"; break;
            case 10: spanishWord = "diez"; break;
            default:
                spanishWord = "Número fuera de rango (1-10)";
        }
	        
	        System.out.println(number + " = " + spanishWord);
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter 10 numbers (from 1 to 10):");

	        
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Enter number " + i + ": ");
	            int number = input.nextInt();
	            displayInSpanish(number); 
	        }
		
	  }
	}
