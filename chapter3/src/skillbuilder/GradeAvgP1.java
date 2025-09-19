package skillbuilder;

import java.util.Scanner;

public class GradeAvgP1 
{

	public static void main(String[] args) 
	{
		
		//Create a Scanner object 
		Scanner input = new Scanner(System.in);	
			
		// Add variables
		int grade1, grade2, grade3, grade4, grade5;
		int average;
	    
	    // Input grades
        System.out.print("Enter grade 1: ");
        grade1 = input.nextInt();

        System.out.print("Enter grade 2: ");
        grade2 = input.nextInt();

        System.out.print("Enter grade 3: ");
        grade3 = input.nextInt();

        System.out.print("Enter grade 4: ");
        grade4 = input.nextInt();

        System.out.print("Enter grade 5: ");
        grade5 = input.nextInt();
        
        // Calculate the average
        average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
        
        // Display the average
        System.out.println("The average grade is: " + average);
		
        
	}

}
