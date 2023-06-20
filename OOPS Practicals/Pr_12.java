
/* Pr:-12 --> Write a program that creates and initializes a four element byte array. Calculate and display the average of its values.

package clg_pr_11_to_14;

public class Pr_12 {

        public static void main(String[] args) {
            int[] arr = {100, 58, 21, 89};

            System.out.println("Printing elements of Arrays :- ");
            for (int element: arr){
                System.out.println(element);
            }

            int sum = 0;
            for (int element: arr){
                sum = sum + element;
            }

            double average = sum/ arr.length;

            System.out.println("Average of arrays element is :- " + average);


    }

}
