package mastery;

public class GameOf21 {
	 private int value; // 1-13

	    // Constructor methods
	 	public GameOf21() {
	        // generate a random card 1–13
	        value = (int)(Math.random() * 13) + 1;
	    }

	    // Raw blackjack value (Ace = 11 for now)
	    public int getRawValue() {
	        if (value == 1) {
	            return 11; // Ace (adjusted later)
	        } else if (value >= 11) {
	            return 10; // J, Q, K
	        } else {
	            return value; // 2-10
	        }
	    }

	    public boolean isAce() {
	        return value == 1;
	    }
	    
	    // Convert the value into card names
	    @Override
	    public String toString() {
	        switch (value) {
	            case 1:
	                return "Ace";
	            case 11:
	                return "Jack";
	            case 12:
	                return "Queen";
	            case 13:
	                return "King";
	            default:
	                return String.valueOf(value); // 2–10
	        }
	    }
	}
