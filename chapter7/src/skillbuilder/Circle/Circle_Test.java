package skillbuilder.Circle;

public class Circle_Test {
	public static void main(String[] args) {

        Circle_AP spot = new Circle_AP(0);  

        spot.setRadius(3);
        System.out.println("Circle radius: " + spot.Radius());
        System.out.println("Circle area: " + spot.area());
        System.out.println("Circle circumference: " + spot.circumference());
        
	}
}
