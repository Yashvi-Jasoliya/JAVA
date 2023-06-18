
/* Pr:-2 --> Write a program to check whether given number is even or odd.  */

package clg_pr_1_to_10;

import java.util.Scanner;

public class Pr_02 {
    public static void main(String[] args) {

        System.out.println("Enter the number :-");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is an Even number");
        }
        else {
            System.out.println(num + " is an Odd number");
        }
    }
}
