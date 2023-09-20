package DSA_IN_JAVA;

import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {

     /* System.out.println("Enter the number :- ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number){
            case 10 :
                System.out.println("Cake");
                break;

            case 20 :
                System.out.println("Pizza");
                break;

            case 30:
                System.out.println("Samosa");
                break;

            default:
                System.out.println("Wake Up!!");
        }
        */


//        calculator

        System.out.println("Enter the a :- ");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();

        System.out.println("Enter the b :- ");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();

        System.out.println("Enter the operator which operation do you want :- ");
        Scanner sc3 = new Scanner(System.in);
        char operator = sc3.next().charAt(0);


        switch (operator){
            case '+' :
                System.out.println("Sum of a and b :- ");
                System.out.println("a + b = " + (a+b));
                break;

            case '-' :
                System.out.println("Substraction of a and b :- ");
                System.out.println("a - b = " + (a-b));
                break;

            case '*' :
                System.out.println("Multiplication of a and b :- ");
                System.out.println("a * b = " + (a*b));
                break;

            case '/' :
                System.out.println("Division of a and b :- ");
                System.out.println("a / b = " + (a/b));

            case '%' :
                System.out.println("Modulo of a and b :- ");
                System.out.println("a % b = " + (a%b));

            default:
                System.out.println("Wrong operation!!");
        }

    }
}
