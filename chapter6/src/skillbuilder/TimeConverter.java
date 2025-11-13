package skillbuilder;

import java.util.Scanner;

public class TimeConverter {
   public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Time Converter Menu:");
     System.out.println("1. Hours to Minutes");
     System.out.println("2. Days to Hours");
     System.out.println("3. Minutes to Hours");
     System.out.println("4. Hours to Days");
     System.out.print("Enter your choice (1-4): ");
     
     int choice = input.nextInt();
     
     System.out.print("Enter a time to convert: ");
     double time = input.nextDouble();

     double convertedTime = 0; 
     String resultMessage = "";
     
     if (choice == 1) {
         convertedTime = time * 60;  
         resultMessage = time + " hour(s) = " + convertedTime + " minute(s)";
     } else if (choice == 2) {
         convertedTime = time * 24;  
         resultMessage = time + " day(s) = " + convertedTime + " hour(s)";
     } else if (choice == 3) {
         convertedTime = time / 60;  
         resultMessage = time + " minute(s) = " + convertedTime + " hour(s)";
     } else if (choice == 4) {
         convertedTime = time / 24;  
         resultMessage = time + " hour(s) = " + convertedTime + " day(s)";
     } else {
         resultMessage = "Error!";
     }
     
     System.out.println(resultMessage);
 }
}