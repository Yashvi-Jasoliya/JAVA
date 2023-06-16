package clg_pr_15_to_23;

public class pr_16 {
    public static void main(String[] args) {
        String inputstr = "java123is234fun";

//      Replace digits with a single space character
        String modifiedstr = inputstr.replaceAll("\\d"," ");
        System.out.println("-> Modify string with Replace is :- \n" + modifiedstr);


//      Split modified string into a Array of string..
        System.out.println("-> Split the Array :- ");
        String[] strArray = modifiedstr.split(" ");

        for (String st : strArray){
            System.out.println(st);
        }
    }
}
