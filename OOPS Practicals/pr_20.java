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

