package July22;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int m1 =scanner.nextInt();


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
