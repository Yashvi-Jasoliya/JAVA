package DSA_IN_JAVA;

public class Access_Modifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Yashvi";
        myAcc.setPassword("12345");   // --> not acccessible but it will be changed..
    }
}
class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
