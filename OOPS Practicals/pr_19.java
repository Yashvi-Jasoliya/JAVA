
/* Pr:-19 --> Write an application that counts the total number of characters in all of its command-line arguments. */

package clg_pr_15_to_23;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class pr_19 {
    public static void main(String[] args) {

        int total = 0;
//        for (String arg : args){
//            total = total + arg.length();
//        }

        System.out.println("Enter the string :- ");
        Scanner sc1 = new Scanner(System.in);
        String st1 = sc1.nextLine();

        String []str = st1.split("\\A");

        for (String ch : str){
            total = total + st1.length();
        }
        System.out.println("Total no. of characters is :- \n" + total);
    }
}
