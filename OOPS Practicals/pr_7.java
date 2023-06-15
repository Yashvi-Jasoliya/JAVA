package clg_pr_1_to_10;

import java.util.Scanner;

public class pr_7 {

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





