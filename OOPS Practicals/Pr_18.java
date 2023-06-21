
/* Pr:-18 --> A string contains five numbers separated by commas .Write a program that displays the last number. */

package clg_pr_15_to_23;

public class Pr_18 {
    public static void main(String[] args) {

        String inputstr = "50, 60, 70, 80, 90" ;

        String[] splitstr = inputstr.split(",");
//        System.out.println(splitstr);


        String lastNum = splitstr[splitstr.length-1].trim();
        System.out.println("-> Last num is :- \n" + lastNum);


    }
}
