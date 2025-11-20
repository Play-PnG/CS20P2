package skillbuilder.Rectangle;

public class Rectangle_Test {
	public static void main(String[] args) {
		
		Rectangle_AP spot = new Rectangle_AP();  

        System.out.println("Rectangle: ");
        System.out.println("Length = " + spot.getLength());
        System.out.println("Width = " + spot.getWidth());
        System.out.println("Area = " + spot.area());
        
        Rectangle_AP r2 = new Rectangle_AP(10, 5);
        System.out.println("Rectangle 2:");
        System.out.println("Length = " + r2.getLength());
        System.out.println("Width = " + r2.getWidth());
        System.out.println("Area = " + r2.area());
	}
}