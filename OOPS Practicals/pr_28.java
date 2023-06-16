

/* Pr:-28 --> Write an application that defines a sphere class with three constructors.The first form accepts no arguments. It assumes the sphere is centered at the 
              origin and has a radius of one unit. The second form accepts one double value that represents the radius of the sphere. It assumes the sphere is centered
              at the origin. The third form accept four double arguments. These specify the coordinates of the center and the radius. */

    
package clg_pr_24_to_31;

public class Sphere2 {
    public double radius;
    public double centerOfX;
    public double centerOfY;
    public double centerOfZ;
        public Sphere2() {
            centerOfX = 0.0;
            centerOfY = 0.0;
            centerOfZ = 0.0;
            radius = 1.0;
        }
        public Sphere2(double radius) {
            centerOfX = 0.0;
            centerOfY = 0.0;
            centerOfZ = 0.0;
            this.radius = radius;
        }
        public Sphere2(double x, double y, double z, double radius) {
            this.centerOfX = x;
            this.centerOfY = y;
            this.centerOfZ = z;
            this.radius = radius;
        }

    public static void main(String[] args) {

            Sphere2 s = new Sphere2(20);
            System.out.println("Radius at origin :- " + s.radius);

            Sphere2 s1 = new Sphere2(20.3, 5.0, 3.2, 30.0);
            System.out.println("Coordinates of Sphere:- (" + s1.centerOfX + ", " + s1.centerOfY + ", " + s1.centerOfZ + ")");
            System.out.println("Radius at (" + s1.centerOfX + ", " + s1.centerOfY + ", " + s1.centerOfZ + ") :- "  + s1.radius);
    }
}
