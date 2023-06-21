
/* Pr:-31 --> Write an application that illustrates how a method can invoke a superclass method. Class I2 is extended by J2.Class J2 is extended by K2.
              Each of these classes defines a getDescription() method that returns a string.That string includes a description of the class plus descriptions of each superclass. 
              Instantiate each of these classes and invoke the getDescription() method.  */

package clg_pr_24_to_31;

class I2 {
    public String getDescription() {
        return "I2";
    }
}
class J2 extends I2 {
//    printing only two class
    @Override
    public String getDescription() {
        String class_j = super.getDescription() + ", J2";
        return class_j;
    }
}

class K2 extends J2 {

//    printing All class
    @Override
    public String getDescription() {
       String class_k = super.getDescription() + ", K2";
       return class_k;
    }
}

public class Pr_31 {
    public static void main(String[] args) {

        I2 i = new I2();
        System.out.println(i.getDescription());

        J2 j = new J2();
        System.out.println(j.getDescription());

        K2 k = new K2();
        System.out.println(k.getDescription());
    }
}
