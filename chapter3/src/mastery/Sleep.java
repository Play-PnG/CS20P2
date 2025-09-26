package mastery;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Sleep {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		System.out.print("Please enter your birthdate (yyyy-mm-dd): ");
        String birthInput = input.nextLine();
        LocalDate birthdate = LocalDate.parse(birthInput, formatter);
        
        System.out.print("Then enter today's date (yyyy-mm-dd): ");
        String todayInput = input.nextLine();
        LocalDate today = LocalDate.parse(todayInput, formatter);
        
        long daysLived = ChronoUnit.DAYS.between(birthdate, today);
        
        long hoursSlept = daysLived * 8;
        
        System.out.println("If you have lived for " + daysLived + " days.");
        System.out.println("You have slept about " + hoursSlept + " hours in your life.");
        
	}

}
