
/* Pr:-34 --> Demonstrate NumberFormatException in the program when wrong data for some variable is entered.  */

package clg_pr_24_to_31;
import java.util.Scanner;

public class Pr_34 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter valid Integer :- ");
            Scanner sc = new Scanner(System.in);

            try {
                int num = Integer.parseInt(sc.next());
                System.out.println("You number :- " + num);
                break;
            } catch (NumberFormatException e) {
                System.out.println("That Number FormatException occurred..");
            }
            
        }
    }
}

