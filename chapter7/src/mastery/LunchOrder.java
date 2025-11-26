package mastery;

public class LunchOrder {
	// Member variables
	private String food;
	private double price;
    private int fat;          // in grams
    private int carbohydrates; // in grams
    private int fiber;        // in grams
    
    // Constructor
    public LunchOrder(String name, double price, int fat, int carbohydrates, int fiber) {
        this.food = name;
        this.price = price;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.fiber = fiber;
    }
    

    // Getter methods (return the values)
    public String getName() {
        return food;
    }

    public double getPrice() {
        return price;
    }

    public int getFat() {
        return fat;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public int getFiber() {
        return fiber;
    }
    
    
 // Setter methods (update the values)
    public void setPrice(double price) {
        this.price = price;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setFiber(int fiber) {
        this.fiber = fiber;
    }
    
 // Method to return all food info
    @Override
    public String toString() {
        return "Food: " + food +
               "\nPrice: $" + price +
               "\nFat: " + fat + " g" +
               "\nCarbohydrates: " + carbohydrates + " g" +
               "\nFiber: " + fiber + " g";
    }
        
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;   
            }

            if (obj instanceof LunchOrder) {
            	LunchOrder other = (LunchOrder) obj;

                // Compare based on food name
                return this.food.equalsIgnoreCase(other.food);
            }

            return false;
         
    }
    
}
