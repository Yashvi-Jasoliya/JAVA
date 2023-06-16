package clg_pr_24_to_31;
import java.util.Scanner;
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String InvalidAgeMessage) {
            super(InvalidAgeMessage);
        }
    }
    public class pr_33{

        public static int getAge() {

            while (true) {

                try {
                    System.out.print("Enter your age :- ");
                    Scanner sc = new Scanner(System.in);
                    int age = sc.nextInt();
                    return age;

                } catch (Exception e) {
                    System.out.println("Invalid Age input...Enter a valid Age integer..");
                }
            }
        }

        public static void main(String[] args) {

            try {

               int age = getAge();
                if (age < 0 || age > 150) {
                    throw new InvalidAgeException("Invalid age.. Age must be between 0 and 150.");
                }

                System.out.println("Your age is -: " + age);
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }

}
