
/* Pr:-20 --> Write an application that searches through its command-line argument. If an argument is found that does not 
              begin with and upper case letter, display error message and terminate.    */

package clg_pr_15_to_23;

public class pr_20 {

    public static void main(String[] args) {


        for (String arg : args) {
            if (Character.isLowerCase(arg.charAt(0))) {
                System.out.println("Wrong Argument " + arg + " ..not start with an uppercase letter.");
                System.exit(1);
            }

            if (!Character.isLowerCase(arg.charAt(0)))
                System.out.println("All arguments are valid.");
        }

       }
}

