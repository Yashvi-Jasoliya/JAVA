package clg_pr_1_to_10;

public class pr_9 {
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