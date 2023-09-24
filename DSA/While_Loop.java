package DSA_IN_JAVA;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {

//        int count=100;
//        while(count <= 1000){
//            System.out.println(count);
//            count++;
//        }
//
//        System.out.println("Printing 1000 numbers");

//        System.out.println("Enter the number :-");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//        int count=1;
//        while(count <= number){
//            System.out.println(count);
//            count++;
//        }
//
//        System.out.println("Printing your numbers");

        System.out.println("Enter the number :-");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum=0;
        int i=1;
        while(i <= number){
            sum = sum + i;
            i++;
        }

        System.out.println("Total sum :- " + sum);
    }
}
