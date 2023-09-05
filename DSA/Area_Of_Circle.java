package DSA_IN_JAVA;

import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {

        System.out.println("Enter the radius :- ");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        float area = (float) (Math.PI * radius * radius);

        System.out.println("The area of circle is :-  " + area);
    }
}
