package DSA_IN_JAVA;

import java.util.Scanner;

public class Questions_3 {
    public static void main(String[] args) {
//        Q :- 1

/*      System.out.println("Enter the number :- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >=0){
            System.out.println(num + " is Positive");
        }
        else {
            System.out.println(num + " is Negative");
        }
 */

//        Q :- 2

 /*     double temp = 103.5;
        if (temp >100){
            System.out.println("you temp is :- " + temp + " ,you have a fever");
        }
        else {
            System.out.println("You don't have fever");
        }
   */

//        Q :- 3

 /*     System.out.println("Enter the day :- ");
        Scanner sc = new Scanner(System.in);
        int Days = sc.nextInt();

        switch (Days){
            case 1 :
                System.out.println("Monday");
                break;

            case 2 :
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4 :
                System.out.println("Thursday");
                break;

            case 5 :
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7 :
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Not found!!");
        }
*/

//        Q :- 4
/*
                int a = 63, b = 36;
                boolean x = (a < b ) ? true : false;
                int y= (a > b ) ? a : b;
                System.out.println(x);
                System.out.println(y);
*/

//        Q :- 5

        System.out.println("Enter the year :- ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0 && ((year % 100) != 0 || (year % 100 == 0) && (year % 400 == 0))){
            System.out.println(year + " year is leap year");
        }
        else{
            System.out.println(year + " year is not leap year");
        }


        }
}
