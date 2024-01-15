
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shape
{
    protected boolean filled;
    protected String colour;
    
    public Shape() {
        colour = "Black";
        filled = false;
    }
    
    public Shape(boolean f, String c) {
        colour = c;
        filled = f;
    }
    
    public double calculateArea() {
        return 0;
    }
    
    public double calculatePerimeter() {
        return 0;
    }
    
    public void displayInfo() {
        System.out.println("Filled: " + filled + ". Colour: " + colour + ".");
    }
}
