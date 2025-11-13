package skillbuilder;
import java.util.Scanner;

public class Exponentiation {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	
	        System.out.print("Enter two numbers separated by a space: ");
	        int base = input.nextInt();
	        int exponent = input.nextInt();
	        
	        double mathPowResult = Math.pow(base, exponent);
	        int customResult = powerOf(base, exponent);
	        
	        System.out.println("Comparison: When base of (" + base + ") and an exponent (" + exponent +") are entered");
	        System.out.println("Using Math.pow(): " + mathPowResult);
	        System.out.println("Using custom powerOf(): " + customResult);
	        
	 } 
	       
	        public static int powerOf(int base, int exponent) {
	            int result = 1;
	            for (int i = 1; i <= exponent; i++) {
	                result *= base;
	            }
	            return result;
	
	  }
	}
