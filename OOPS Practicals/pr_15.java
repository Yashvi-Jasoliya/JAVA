
/* Pr:-15 --> Create two dimensional array of int with user given input. Display the summation of all elements of 2D array using for each loop.  */

package clg_pr_15_to_23;

import java.util.Scanner;

public class pr_15 {
    public static void main(String[] args) {

        String  str1 = new String("Java Language");
        String str2 = new String("This is Java Assignment ");


//      Comparison of strings
        System.out.println("Comparison of strings :- " + str1.equals(str2));

        if (str1.equals(str2)) {
            System.out.println("Matched..");
        }
        else{
            System.out.println("Not Matched..");
        }


//      Append string 2 to string 1..
        System.out.println("Appending string 2 to 1 :- " + str2.concat(str1) );

    }
}
