package mastery;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String correctPassword = "Password"; 
        int maxAttempts = 3; 
        boolean accessGranted = false;
		
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
        	System.out.print("Enter password (attempt " + attempt + " of " + maxAttempts + "): ");
        	String enteredPassword = input.nextLine();
        	
        	if (enteredPassword.equals(correctPassword)) {
                System.out.println("Access Granted!");
                accessGranted = true;
                break; 
            } else {
                System.out.println("Incorrect password.");
            }
        }

        if (!accessGranted) {
            System.out.println("Access Denied.");
        }
	
		
		
	   }
	}
