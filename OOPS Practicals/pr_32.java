
/* Pr:-32 --> Write a program that will accept two integers with the use of command line or scanner class. Divide first integer by second, 
              display the result and also handle appropriate exception if second number is zero.  */

package clg_pr_24_to_31;
import java.util.Scanner;

public class pr_32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer 1: ");
        int integer1 = sc.nextInt();
        System.out.print("Enter the integer 2: ");
        int integer2 = sc.nextInt();

        try {
            if (integer2 != 0) {
                double result =  integer1 / integer2;
                System.out.println("Result of Divison :- " + result);
            } else {
                System.out.println("Division by zero is not allowed..Enter other integer");
            }
        } catch (Exception e) {
            System.out.println("Invalid Argument..");
        }

    }
}
