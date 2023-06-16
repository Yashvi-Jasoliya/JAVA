package clg_pr_15_to_23;

import java.util.Scanner;

public class pr_22 {

    public static void main(String[] args) {

        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

      if(str.equals("Exit")) {
          System.out.println("You are exittted..");
      }
      else {
          StringBuilder reverse_st = new StringBuilder(str);
          reverse_st.reverse();
          System.out.println("Reversed string: \n" + reverse_st);
      }

    }
}

