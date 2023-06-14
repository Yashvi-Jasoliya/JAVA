package clg_pr_1_to_10;

import java.util.Scanner;

public class pr_4 {
    public static void main(String[] args) {
        int n , prime = 1;
        System.out.println("Enter the number :-");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 2; i < n ;i++){
            if (n%i==0)
            {
                prime = 0;
                break;
            }
        }
        if(prime == 0){
            System.out.println("This is a not prime number");
        }
        else{
            System.out.println("This is a prime number");
        }
    }
}
