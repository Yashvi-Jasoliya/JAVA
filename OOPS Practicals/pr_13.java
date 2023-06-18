
/* Pr:-13 --> Write a program to search in the int array with use of for each style for loop. */

package clg_pr_11_to_14;

import java.util.Scanner;

public class pr_13 {
    public static void main(String[] args) {

            int[] arr = {100, 58, 21, 89};
             System.out.println("Enter the element which you search :- ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            boolean found = false;
            for (int element: arr){
                if (num == element){
                  found = true;
                  break;
                }

            }
        
            if (found){
                System.out.println(num + " is found in array..");
            }
            else {
                System.out.println(num + " is not found in array..");
            }
           
    }
}
