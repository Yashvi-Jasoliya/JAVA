
/* Pr:-5 --> Write a program to print following triangle with character ‘A’ for n rows, n is to be passed as command line argument.
             A  A  A  A
             A  A  A 
             A  A
             A      */


package clg_pr_1_to_10;

public class pr_05 {
    public static void main(String[] args) {

        int n = 4;
        for (int i = n; i!=0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf("A ");
            }
            System.out.println("");
        }
    }
}
