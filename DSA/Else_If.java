package DSA_IN_JAVA;
import java.util.Scanner;

public class Else_If {
    public static void main(String[] args) {

//        Cheacking age

//        System.out.println("Enter the your age :- ");
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        if (age >= 18){
//            System.out.println("Adult : drive, vote");
//        }
//        else if (age >= 13 && age < 18){
//            System.out.println("teenager");
//        }
//        else {
//            System.out.println("Child");
//        }

//        Calculate Income Tax

//        System.out.println("Enter the income in lakhs :- ");
//        Scanner sc = new Scanner(System.in);
//        int income = sc.nextInt();
//        float tax ;
//
//        if (income < 5){
//            tax = 0;
//        }
//        else if (income >= 5 && income < 10){
//            tax = income * 0.2f;
//        }
//        else {
//            tax = income * 0.3f;
//        }
//
//        System.out.printf("your tax is :- %.2f" , tax , "%");

//        print the Largest of 3

        System.out.println("Enter the number 1 :- ");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();

        System.out.println("Enter the number 2 :- ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();

        System.out.println("Enter the number 3 :- ");
        Scanner sc3 = new Scanner(System.in);
        int num3 = sc3.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("Number 1 --> " + num1 + " is larger");
        }
        else if (num2 >= num3 ){
            System.out.println("Number 2 --> " + num2 + " is larger");
        }
        else {
            System.out.println("Number 3 --> " + num3 + " is larger");
        }

    }
}
