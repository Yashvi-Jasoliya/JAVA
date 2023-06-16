
/* Pr:-27 --> Write an application that defines a Circle class with two constructors. The first form accepts a double value that represents the radius of the circle. 
              This constructor assumes that the circle is centered at the origin (will set center coordinates to zero). The second form accepts the three double values. 
              The first two arguments define the coordinates of the center and the third argument defines the radius. Set and display its instance variables.  */

package clg_pr_24_to_31;

public class Circle2 {
    public double centerOfX;
    public double centerOfY;
    public double radius;

    public Circle2(double radius) {
        this.centerOfX = 0;
        this.centerOfY = 0;
        this.radius = radius;
    }
    public Circle2(double centerOfX, double centerOfY, double radius) {
        this.centerOfX = centerOfX;
        this.centerOfY = centerOfY;
        this.radius = radius;
    }

    public void display() {
        System.out.println("Center coordinates and radius of circle (" + centerOfX + "," + centerOfY + ") :-  (" + centerOfX + ", " + centerOfY + ", " + radius + ")");
        System.out.println("Radius of circle with origin :- " + radius);
    }

    public void display2() {
        System.out.println("Center coordinates and radius of circle (" + centerOfX + "," + centerOfY + ") :- (" + centerOfX + ", " + centerOfY + ", " + radius + ")");
        System.out.println("Radius of circle with (" + centerOfX + "," + centerOfY + ") :- " + radius);
    }

    public static void main(String[] args) {

        Circle2 c1 = new Circle2(9.2);
        c1.display();

        Circle2 c2 = new Circle2(25.2, 20, 15);
        c2.display2();
    }
}

