package mastery;

import java.util.Scanner;

public class CarRecall {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Welcome to CarRecall, please enter your car model number: ");
		int car_model = input.nextInt();
	
		int[] defectiveModel = {119, 179, 189, 195, 221, 780};
		
		 boolean isDefective = false;

	        for (int defective : defectiveModel) {
	            if (car_model == defective) {
	                isDefective = true;
	                break;
	            }
	        }
                    
        if (isDefective) 
        {
        	System.out.println("Your car is defective, please bring your car to a shop.");
        } else {
            System.out.println("Your car is not defective, thanks for stopping by!");
        }
    }
}


