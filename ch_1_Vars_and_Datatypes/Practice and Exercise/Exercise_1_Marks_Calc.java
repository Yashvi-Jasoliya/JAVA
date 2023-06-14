package ch_1_Vars_and_Datatypes;
import java.util.Scanner;

public class L_11_exercise_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of physics :");
        float phy = scan.nextFloat();
        System.out.println("Enter the marks of chemistry :");
        float che = scan.nextFloat();
        System.out.println("Enter the marks of maths :");
        float maths = scan.nextFloat();
        System.out.println("Enter the marks of english :");
        float eng = scan.nextFloat();
        System.out.println("Enter the marks of computer :");
        float comp = scan.nextFloat();

        float total = phy + che + maths + eng + comp;
        System.out.println("Total Marks:- " + total);

        float prtage = ((phy + che + maths + eng + comp)/5.0f);
        System.out.println("your prtage is :");
        System.out.print(prtage);
        System.out.println("%");
    }
}

