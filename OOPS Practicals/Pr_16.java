
/* Pr:-16 --> Write a program that will accept a string “java123is234fun” will replace all occurrences of digit with single space character in 
              a new string. (use of replaceAll() function and regular expression for digit).Split the new formed string from space character and form the array of 
              strings (use of split function). Display strings from the array in new line each.  */

package clg_pr_15_to_23;

public class Pr_16 {
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
