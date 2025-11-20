package skillbuilder.Rectangle;


public class Rectangle_AP {
	private int length;
    private int width;
    
    public Rectangle_AP() {
        length = 6;   
        width = 7;
        
    }  
        
    public Rectangle_AP(int l, int w) {
       length = l;  
       width = w;
       
       }
    
       public int getLength() {
           return length;
       }

       public int getWidth() {
           return width;
       }
       
       public int area() {
           return length * width;
           
       }
           
       @Override
       public String toString() {
           return "Rectangle: length=" + length +
                  ", width=" + width +
                  ", area=" + area();
       }
           
       @Override
       public boolean equals(Object obj) {
           
    	   if (this == obj) {
               return true;
           }

           if (obj instanceof Rectangle_AP) {
        	   Rectangle_AP other = (Rectangle_AP) obj;
               return this.length == other.length &&
                      this.width == other.width;
           }
           return false;
       }
   }
