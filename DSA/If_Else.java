package DSA_IN_JAVA;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
//        Cheacking age

//        System.out.println("Enter the your age :- ");
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age >= 18){
//            System.out.println("Adult : drive, vote");
//        }
//
//        if (age > 13 && age < 18){
//            System.out.println("teenager");
//        }
//        else {
//            System.out.println("Not adult");
//        }

//      Cheacking greater number

//        System.out.println("Enter the your number 1:- ");
//        Scanner sc1 = new Scanner(System.in);
//        int num1 = sc1.nextInt();
//
//        System.out.println("Enter the your number 1:- ");
//        Scanner sc2 = new Scanner(System.in);
//        int num2 = sc1.nextInt();
//
//        if (num1 > num2) {
//            System.out.println("Number 1 is greater");
//        }
//        else{
//            System.out.println("Number 2 is greater");
//        }

//     Cheacking EVEN or ODD number

        System.out.println("Enter the your number :- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}
