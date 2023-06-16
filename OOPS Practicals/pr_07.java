
 /*  Pr:-7 --> Write an application that converts between meters and feet. its first command-line argument is a number. Its second command-line
               argument if either “feet” or “meters”. If this argument equal “feet”, display a string reporting the equivalent number of meters. 
               If this argument equal “meters”, display a string reporting the equivalent number of feet. Otherwise, report that the unit system is not recognized. (note: one meter is equal to 3.28 feet.)  */

package clg_pr_1_to_10;

import java.util.Scanner;

public class pr_07 {

    public static void main(String[] args) {

        System.out.println("Enter the value :- ");
        Scanner sc1 = new Scanner(System.in);
        double value = sc1.nextDouble();

        System.out.println("Enter the string :- ");
        Scanner sc2 = new Scanner(System.in);
        String unit = sc2.nextLine();

        if (true) {

            if (unit.equals("feet")) {
                double meters =  value / 3.28;
                System.out.println(value + " feet is --> " + meters + " meters");
            }
            else if (unit.equals("meters")) {
                double feet = value * 3.28;
                System.out.println(value + " meters is --> " + feet + " feet");
            }
            else {
                System.out.println("Unit system is not recognized");
            }
        }
        else{
            System.out.println("Not valid argument..");
        }
    }


}





