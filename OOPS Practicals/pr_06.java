
/* Pr:-6 --> Write an application that accepts two doubles as its command-line arguments, multiplies these together, and display the product. */

package clg_pr_1_to_10;

import java.util.Scanner;

public class pr_06 {
    public static void main(String[] args) {
        
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        double num2 = sc.nextDouble();
        double prod = num1*num2;
        System.out.printf("The product of %f * %f is :-  %f", num1,num2,prod);


    }
}
