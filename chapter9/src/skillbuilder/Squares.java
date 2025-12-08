package skillbuilder;

public class Squares {

	public static void main(String[] args) {
		
		int[] array = new int[5];  

        
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }

        System.out.println("Array values (square of index):");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + " = " + array[i]);
        }
	}
}
