
/* Pr:-14 --> Create two dimensional array of int with user given input. Display the summation of all elements of 2D array using for each loop.  */

package clg_pr_11_to_14;

import java.util.Scanner;

public class Pr_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the raw :- ");
        int r = sc.nextInt();
        System.out.println("Enter the column :- ");
        int c = sc.nextInt();

        System.out.println("Enter the values for 2-D Arrays :- ");
        Scanner sc1 = new Scanner(System.in);
//        int i=0; int j=0;
        int matrix[][] = new int [r][c];
        for (int i=0; i<r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum=0;

        for (int []raw: matrix) {
            for (int element: raw ) {
                sum = sum + element;
            }
        }
        System.out.println("Sum of 2-D Array elements is :- " + sum );
    }
}
