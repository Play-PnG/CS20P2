package skillbuilder;

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Ask the user for the number of students
        System.out.print("Enter the number of students in the class: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();
        
        String[] names;
        names = new String[numberOfStudents];
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }
        
        System.out.println("\nStudent Roster:");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
        
	}
}
