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

public class pr_31 {
    public static void main(String[] args) {

        I2 i = new I2();
        System.out.println(i.getDescription());

        J2 j = new J2();
        System.out.println(j.getDescription());

        K2 k = new K2();
        System.out.println(k.getDescription());
    }
}
