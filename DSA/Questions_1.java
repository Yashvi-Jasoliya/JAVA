package DSA_IN_JAVA;

import java.util.Scanner;

public class Questions_1 {
    public static void main(String[] args) {

//        Q:1

//        System.out.println("Enter 3 numbers");
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//
//        Scanner sc1 = new Scanner(System.in);
//        int num2 = sc.nextInt();
//
//        Scanner sc2 = new Scanner(System.in);
//        int num3 = sc.nextInt();
//
//        float avg = (num1 + num2 + num3)/3.0f;
//        System.out.println("Average :- " + avg);


//        Q:2

//        System.out.println("Enter the side :- ");
//        Scanner sc = new Scanner(System.in);
//        int side = sc.nextInt();
//
//        int area = side * side;
//        System.out.println("Area of the square :- " + area);


//         Q:3

        System.out.println("Enter the price of pencil  :- ");
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();

        System.out.println("Enter the price of pen  :- ");
        Scanner sc1 = new Scanner(System.in);
        float pen = sc.nextFloat();

        System.out.println("Enter the price of eraser  :- ");
        Scanner sc2 = new Scanner(System.in);
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Your total bill is :- " + total);

        float tax_total = (pencil + pen + eraser) + (0.18f * total);
        System.out.println("Your total bill with 18% tax is :- " + tax_total);

//        Q:4

//        byte b =23;
//        char c = 'v';
//        short s = 26;
//        int i = 56;
//        float f = 63.2f;
//        double d = 88.365;
//
//        result = (f * b) + (i % c) - (d * s);


//        Q:5
//        int $ = 12;
//        System.out.println($);

    }
}
