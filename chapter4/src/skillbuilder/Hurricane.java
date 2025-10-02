package skillbuilder;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("What category is your hurricane (1-5): ");
		int category = input.nextInt();
		
		switch (category) {
        case 1:
            System.out.println("Category 1: 74-95 mph (119-153 km/h) or 64-82 kt");
            break;
        case 2:
            System.out.println("Category 2: 96-110 mph (154-177 km/h) or 83-95 kt");
            break;
        case 3:
            System.out.println("Category 3: 111-130 mph (178-209 km/h) or 96-113 kt");
            break;
        case 4:
            System.out.println("Category 4: 131-155 mph (210-249 km/h) or 114-135 kt");
            break;
        case 5:
            System.out.println("Category 5: 155+ mph (249+ km/h) or 135 kt");
            break;
        default:
            System.out.println("Error! Please enter between 1 and 5.");
    }

		
	}

}
