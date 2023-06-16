
/* Pr:-9 --> Use While loop to generate random numbers and maintain a running sum of these values.
             Terminate when the sum exceeds 20. (Note: use Math. random() method to obtain numbers.)    */

package clg_pr_1_to_10;

public class pr_09 {
    public static void main(String[] args) {
        double sum = 0;
        while (sum <= 20) {

            double random = Math.random();
            System.out.println("Random number :- " + random);
            sum = sum + random;
            System.out.println("sum:- " + sum);
        }
        System.out.println("--> Total Sum :- " + sum);
        System.out.println("Sum exceeds 20 then loop terminated..");
    }
}
