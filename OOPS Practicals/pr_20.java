
/* Pr:-20 --> Write an application that searches through its command-line argument. If an argument is found that does not 
              begin with and upper case letter, display error message and terminate.    */

package clg_pr_15_to_23;

public class pr_20 {

    public static void main(String[] args) {

        System.out.println("Enter String Which first letter in Uppercase..");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] arr = st.split("\\A");

        for (String element : arr) {
            if (Character.isLowerCase(st.charAt(0))) {
                System.out.println("Wrong Argument " + st + " ..not start with an uppercase letter.");
                System.exit(1);
            }

            if (!Character.isLowerCase(st.charAt(0)))
                System.out.println("All arguments are valid.");
        }

       }
}

