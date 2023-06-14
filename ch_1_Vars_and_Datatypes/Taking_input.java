package ch_1_Vars_and_Datatypes;

//package com.company;
import java.util.Scanner;

public class L_05_taking_input {

    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the num 1 ");
////       int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter the num 2");
////        int b = sc.nextInt();
//        float b = sc.nextFloat();
////        int sum = a + b;
//        float sum = a + b;
//        System.out.println("The sum num is " + sum);


//        checking input is int or not.. gives true or false..
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);


//        String st = sc.next(); --> only for one word..
        String st = sc.nextLine();
        System.out.println(st);
    }

}

