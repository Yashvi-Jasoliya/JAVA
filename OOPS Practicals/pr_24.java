package clg_pr_24_to_31;

import java.util.Scanner;

class Circle{
    public double area(int r){
        double Area = Math.PI * r * r;
        return Area;
    }

}

public class pr_24 {

    public static void main(String[] args) {

        System.out.println("Enter the radius :- ");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        System.out.println("Radius :- " + radius);
        Circle c1 = new Circle();
        System.out.println("Area of the circle :- " + c1.area(radius));

    }
}
