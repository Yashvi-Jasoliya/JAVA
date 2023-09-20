package DSA_IN_JAVA;

import java.util.Scanner;

public class Ternary_operator {
    public static void main(String[] args) {

    /*  System.out.println("Enter the number :-");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        Ternary operator

        String type = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(type);

     */


//        Check student is pass or not

        System.out.println("Enter the mark:-");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        String result = (mark >= 33) ? "PASS" : "FAIL";
        System.out.println(result);

    }
}
