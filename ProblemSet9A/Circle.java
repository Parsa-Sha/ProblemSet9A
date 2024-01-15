
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape{
    double radius;
    
    public Circle(boolean f, String c, double r) {
        super(f, c);
        radius = r;
    }
    
    public double calculateArea() {
        return Math.PI * radius*radius;
    }
    
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public void displayInfo() {
        System.out.println("Filled: " + filled + ". Colour: " + colour + ". Radius: " + radius + ".");
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double r) {
        radius = r;
    }
}
