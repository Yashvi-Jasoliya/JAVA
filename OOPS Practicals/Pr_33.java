
/* Pr:-33 --> Write a program to accept age of user with the use of commandline or scanner class. Create and throw user defined exception named “InvalidAge” with error message.   */

package clg_pr_24_to_31;
import java.util.Scanner;

    class InvalidAgeException extends Exception {
        public InvalidAgeException(String InvalidAgeMessage) {
            super(InvalidAgeMessage);
        }
    }

    public class Pr_33{
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
