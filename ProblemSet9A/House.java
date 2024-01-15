
/**
 * Write a description of class House here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class House extends Shape{
    double side;
    
    public House(boolean f, String c, double s) {
        super(f, c);
        side = s;
    }
    
    public double calculateArea() {
        return side * side + (side * side * Math.tan(Math.toRadians(60)) / 2.0);
    }
    
    public double calculatePerimeter() {
        return 5 * side;
    }
    
    public void displayInfo() {
        System.out.println("Filled: " + filled + ". Colour: " + colour + ". Side Length: " + side + ".");
    }
    
    public double getSide() {
        return side;
    }
    
    public void setRadius(double s) {
        side = s;
    }
}
