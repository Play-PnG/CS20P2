package skillbuilder.Circle;

public class Circle_AP {
	
	
    private double radius;

    
    public Circle_AP(double radius) {
        this.radius = radius;
    }

    
    public double area() {
        return Math.PI * radius * radius;
    }

    
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    
    public double Radius() {
        return radius;
    }

    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    @Override
    public String toString() {
        return "Circle with radius: " + radius +
               ", area: " + area() +
               ", circumference: " + circumference();
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle_AP) {
        	Circle_AP other = (Circle_AP) obj;
            return this.radius == other.radius;
        }
        return false;
    }
}
