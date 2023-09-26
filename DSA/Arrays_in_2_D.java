package DSA_IN_JAVA;

import java.util.Scanner;

public class Arrays_in_2_D {
        public static boolean search(int[][] matrix, int key) {
            for (int i=0; i< matrix.length; i++) {
                for (int j=0; j< matrix[0].length; j++){
                    if (matrix[i][j] == key) {
                        System.out.println("Found key at cell [" + i + "," + j + "]");
                        return true;
                    }
                }
            }
            System.out.println("key not found");
            return false;
        }
        

        public static void main(String[] args) {

            int matrix[][] = new int[3][3];
            int r = matrix.length, c = matrix[0].length;

            System.out.println("Enter the values for 2-D Arrays :- ");
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

//        Output
                
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            search(matrix, 6);
        }
    }

