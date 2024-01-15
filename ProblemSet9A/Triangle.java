
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle extends Shape{
    double length1;
    double length2;
    double length3;
    
    public Triangle(boolean f, String c, double l1, double l2, double l3) {
        super(f, c);
        length1 = l1;
        length2 = l2;
        length3 = l3;
    }
    
    public double calculateArea() {
        double s = this.calculatePerimeter() / 2;
        return Math.sqrt(s * (s-length1) * (s-length2) * (s-length3));
    }
    
    public double calculatePerimeter() {
        return length1 + length2 + length3;
    }
    
    public void displayInfo() {
        System.out.println("Filled: " + filled + ". Colour: " + colour + ". Side length 1: " + length1 + ". Side length 2: " + length2 + ". Side length 3: " + length3 +  ".");
    }
    
    public double getLength1() {
        return length1;
    }
    
    public void setLength1(double l) {
        length1 = l;
    }
    
    public double getLength2() {
        return length2;
    }
    
    public void setLength2(double l) {
        length2 = l;
    }
    
    public double getLength3() {
        return length3;
    }
    
    public void setLength3(double l) {
        length3 = l;
    }
    
}
