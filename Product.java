package DSA_IN_JAVA;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 :- ");
        float num1 = sc.nextFloat();

        System.out.println("Enter the number 2 :- ");
        float num2 = sc.nextFloat();

        System.out.println("Sum :- "+ (num1 * num2));
    }
}
