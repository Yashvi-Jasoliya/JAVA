
/* Pr:-10 --> Write an application that generates the first 15 numbers in the Fibonacci series.

package clg_pr_1_to_10;

import java.util.Scanner;

public class pr_10 {
    public static void main(String[] args) {

        System.out.println("Enter the number:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Fibonacci series :-");
        int n1 = 0, n2 = 1, nextterm;
        System.out.printf("%d,%d", n1, n2);

        for(int i = 2; i < 15; i++)
        {
            nextterm = n1 + n2;
            System.out.printf(",%d", nextterm);
            n1 = n2;
            n2 = nextterm;
        }

    }
}

