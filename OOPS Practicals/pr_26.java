package clg_pr_24_to_31;

import java.util.Scanner;

// Pr:-26 --> Write an application that declares a class named Sphere. It should have instance variables to record its radius and the coordinates of its 
              center.This should be of type double. Use the new operator to create a Sphere object. Set and display its instance variables.

public class Sphere {
    public double radius;
    public double centerOfX;
    public double centerOfY;
    public double centerOfZ;

    public Sphere(double radius, double centerOfX, double centerOfY, double centerOfZ) {
        this.radius = radius;
        this.centerOfX = centerOfX;
        this.centerOfY = centerOfY;
        this.centerOfZ = centerOfZ;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:- ");
        double rad = sc.nextDouble();

        System.out.println("Enter the X coordinate:- ");
        double X = sc.nextDouble();

        System.out.println("Enter the Y coordinate:- ");
        double Y = sc.nextDouble();

        System.out.println("Enter the Z coordinate:- ");
        double Z = sc.nextDouble();

        Sphere s = new Sphere(rad,X, Y, Z);

        System.out.println("Radius: " + s.radius);
        System.out.println("Coordinates of Sphere: (" + s.centerOfX + ", " + s.centerOfY + ", " + s.centerOfZ + ")");
    }
}
