package skillbuilder;

import java.util.Scanner;

public class GradeAvgP2 
{

	public static void main(String[] args) 
	{
		
		//Create a Scanner object 
		Scanner input = new Scanner(System.in);	
			
		// Add variables
		int grade1, grade2, grade3, grade4, grade5;
		int sum = 0;
		double average;
	    
	    // Input grades
        System.out.print("Enter grade 1: ");
        grade1 = input.nextInt();
        sum += grade1;
        
        System.out.print("Enter grade 2: ");
        grade2 = input.nextInt();
        sum += grade2;
        
        System.out.print("Enter grade 3: ");
        grade3 = input.nextInt();
        sum += grade3;
        
        System.out.print("Enter grade 4: ");
        grade4 = input.nextInt();
        sum += grade4;
        
        System.out.print("Enter grade 5: ");
        grade5 = input.nextInt();
        sum += grade5;
        
        // Calculate the average
        average = sum / 5;
        
        // Round to 2 decimal places manually
        average = Math.round(average * 100.0) / 100.0;
        
        // Display result with a % sign
        System.out.println("The average grade is: " + average + "%");
		
        
	}

}
