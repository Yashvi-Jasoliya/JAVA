
/* Pr:-23 --> Create a StringBuffer object and illustrate the operation of the append() and reverse() methods.  */

package clg_pr_15_to_23;

import java.util.Scanner;

public class Pr_23 {
    public static void main(String[] args) {
        System.out.println("Enter the string 1 ");
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.nextLine();

        System.out.println("Enter the string 2");
        Scanner sc2 = new Scanner(System.in);
        String str2 = sc2.nextLine();

        StringBuffer Buffer_string = new StringBuffer();

//      Appending
        StringBuffer Sb1 = Buffer_string.append(str1);
        StringBuffer sb2 = Buffer_string.append(str2);
        StringBuffer append_st = sb2;
        System.out.println("Appending String :- " + append_st);

//      Reversing
        StringBuffer sb_r2 = Buffer_string.reverse();
        StringBuffer reverse_st = sb_r2;
        System.out.println("Reverse string :- " + reverse_st);
     }
}
