
/* Pr:-22 --> Write an application that reads and processes strings from the console(stays at console). Reverse the sequence of characters in each string and then display it.  */

package clg_pr_15_to_23;

import java.util.Scanner;

public class Pr_22 {

    public static void main(String[] args) {

        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

       StringBuilder reverse_st = new StringBuilder(str);
       reverse_st.reverse();
       System.out.println("Reversed string: \n" + reverse_st);
      

    }
}

