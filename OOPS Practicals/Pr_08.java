
/* Pr:-8 --> Write a program that outputs a table of numbers. Each line in the table contains three entries: the number,
             its square, and its cube. Begin with 1 and end with 10.  */

package clg_pr_1_to_10;

public class Pr_08 {
    public static void main(String[] args) {

        System.out.println("number " + "Square " + "Cube ");

        for (int i= 1; i<=10;i++){
            System.out.printf("%d, %d, %d\n", i, i*i , i*i*i);

        }

    }
}
