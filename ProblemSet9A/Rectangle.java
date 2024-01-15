
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape{
    double length;
    double width;
    
    public Rectangle(boolean f, String c, double x, double y) {
        super(f, c);
        length = x;
        width = y;
    }
    
    public double calculateArea() {
        return length * width;
    }
    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    public void displayInfo() {
        System.out.println("Filled: " + filled + ". Colour: " + colour + ". Length: " + length + ". Width: " + width + ".");
    }
    
    public double getLength() {
        return length;
    }
    
    public void setLength(double l) {
        length = l;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double w) {
        width = w;
    }
}
