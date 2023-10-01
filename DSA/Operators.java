package DSA_IN_JAVA;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

//        Arithmatic operator/Binary

//        System.out.println("Enter the A :- ");
//        Scanner sc1 = new Scanner(System.in);
//        int A = sc1.nextInt();
//
//        System.out.println("Enter the B :- ");
//        Scanner sc2 = new Scanner(System.in);
//        int B = sc2.nextInt();
//
//        System.out.printf("%d + %d :- %d\n", A, B, A+B);
//        System.out.printf("%d - %d :- %d\n", A, B, A-B);
//        System.out.printf("%d * %d :- %d\n", A, B, A*B);
//        System.out.printf("Modules of %d and %d :- %d\n", A, B, A%B);

//      2.  Unary operator

//        int a = 15;
//        int b = ++a;
//        int b = a++;
//        System.out.println("a :- " + a);
//        System.out.println("b :- " + b);

//        int a = 15;
//        int b = --a;
////      int b = a--;
//        System.out.println("a :- " + a);
//        System.out.println("b :- " + b);

//     3.   Relational operator

//        int a = 15;
//        int b = 20;
////        System.out.println((a==b));
//        System.out.println((a!=b));
//        System.out.println((a>b));
//        System.out.println((a<b));
//        System.out.println((a>=b));
//        System.out.println((a<=b));

//        4.  Assignment operator

        int A = 15;
//        A = A + 5;
          A += 5;
//        A -= 2;
//        A *= 2;
//        A /= 5;
//        A %= 2;
        System.out.println(A);

//        5. Logical operator

//      AND  op
        System.out.println((5<6) && (6<7));

//        OR op
        System.out.println((5>6) || (6<7));
        
//        NOT op
        System.out.println( !(3>2) );

    }
}
