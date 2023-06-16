
/* Pr:-11 --> Write an application that creates an array with five Float command line arguments and display the length of the array after creation and its elements.  */

package clg_pr_11_to_14;

public class pr_11 {
    public static void main(String[] args) {
        float[] arr = {50.3f, 55.36f, 98.36f, 41.0f, 87.36f};

        System.out.println("Printing elements of Arrays :- ");
        for (float element: arr){
            System.out.println(element);
        }
        System.out.println("Length of array is :- " + arr.length);

    }
}
