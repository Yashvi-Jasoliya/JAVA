
/* Pr:-29 --> Create circle class then derive cylinder class with overriding of  area calculation method. */

package clg_pr_24_to_31;

public class Circle3 {
 public double radius;

    public Circle3(double radius) {
        this.radius = radius;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle3 {
    public double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double Area() {
        double area = (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
        return area;
    }

    public static void main(String[] args) {

        Circle3 c = new Circle3(2);
        System.out.println("Area of circle :- " + c.Area() );

        Cylinder cy = new Cylinder(3, 4);
        System.out.println("Area of cylinder :- " + cy.Area());
    }
}

