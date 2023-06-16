package clg_pr_15_to_23;

import java.util.Scanner;

public class pr_17 {
    public static void main(String[] args) {

        System.out.println("Enter String which has 10 or more chracters :- ");
        Scanner sc = new Scanner(System.in);
        String inputstr = sc.nextLine();

        int length = inputstr.length();
        System.out.println("Length of string is :- " + length);

        if (length >= 10){
            String lastTenChar_Subst = inputstr.substring(length-10);
            System.out.println("-> Last ten characters :- \n" + lastTenChar_Subst);
        }
        else {
            System.out.println("-> String has no 10 or more characers..");
        }
    }
}
