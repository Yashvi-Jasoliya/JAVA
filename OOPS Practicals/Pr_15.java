
/* Pr:-15 --> Write a program that will create two strings using new keyword, compare them and show true if they are same, append second to first.  */

package clg_pr_15_to_23;

import java.util.Scanner;

public class Pr_15 {
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
