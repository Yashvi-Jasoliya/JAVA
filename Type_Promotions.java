package DSA_IN_JAVA;

public class Type_Promotions {
    public static void main(String[] args) {
//        char a = 'a';
//        char b = 'b';
////        char c = a - b;  --> throws error
//        System.out.println((int) (a));
//        System.out.println((int) (b));
//        System.out.println(b-a);  // only for expression..
//
//        int a = 15;
//        float b = 3.6f;
//        long c = 36;
//        double d = 30.6;
//        double ans = a + b + c + d;  // All converted in double by expression..
//        System.out.println(ans);

        byte b = 5;
//      byte a = b * 2;  --> Gives error bcz of expression a will be int
        byte a = (byte) (b * 2);
        System.out.println(a);

    }
}
