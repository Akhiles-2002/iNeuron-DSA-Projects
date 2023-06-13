/*
Q7-
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Example :

**Input:** n = 3

**Output:** [[1,2,3],[8,9,4],[7,6,5]].

 */
import java.util.Arrays;;

public class Q7SpiralMatrix {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        int num = 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Fill the top row
            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = num++;
            }
            rowStart++;

            // Fill the right column
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = num++;
            }
            colEnd--;

            // Fill the bottom row
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    matrix[rowEnd][i] = num++;
                }
                rowEnd--;
            }

            // Fill the left column
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    matrix[i][colStart] = num++;
                }
                colStart++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);

        // Print the generated matrix
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
