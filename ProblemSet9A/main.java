
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main() {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(true, "red", 9);
        shapes[1] = new Rectangle(false, "orange", 3, 4);
        shapes[2] = new Triangle(false, "yellow", 3, 4, 5);
        shapes[3] = new Pentagon(false, "green", 5);
        shapes[4] = new House(true, "blue", 5);
        
        for (Shape s : shapes) {
            s.displayInfo();
            System.out.println(s.calculateArea());
            System.out.println(s.calculatePerimeter());
        }
    }
}
