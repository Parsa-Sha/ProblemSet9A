
/**
 * Write a description of class Pentagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pentagon extends Shape{
    double side;
    
    public Pentagon(boolean f, String c, double s) {
        super(f, c);
        side = s;
    }
    
    public double calculateArea() {
        return 5 * (side * side  * Math.tan(Math.toRadians(54))/ (4.0));
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
