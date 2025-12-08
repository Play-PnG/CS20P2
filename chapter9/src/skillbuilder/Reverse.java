package skillbuilder;

public class Reverse {

	public static void main(String[] args) {
	
		 
		int[] numbers = new int[10]; 

	       
        for (int i = 0; i < numbers.length; i++) 
        {
            numbers[i] = i;
        }

        
        System.out.println("Reverse countdown:");
        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.println(numbers[i]);
        }
    }
}

