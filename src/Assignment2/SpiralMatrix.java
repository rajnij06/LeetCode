package Assignment2;

import java.util.Arrays;

public class SpiralMatrix {

    public static void main (String[] agrs) {
       int[][] matrix = {{1,2,3, 4},{12, 13, 14, 5},{11, 16, 15, 6}, {10, 9, 8, 7}};
//        int[][] matrix = {{1,2,3},{8,9,4},{7,6,5}};
//        int[][] matrix = {{1,2,3,4},{8,7,6,5}};
//        int[][] matrix = {{1,2,3,4},{8,7,6,5}};
//        int[][] matrix = {{1,2,3,4}};
//        int[][] matrix = {{1,2},{4,3}};
        int[] result = spiral(matrix);
        System.out.println(Arrays.toString(result));
    }
    public static int[] spiral(int[][] matrix) {
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        int a = 0;
        int b = 0;
        int max = matrix.length * matrix[0].length;
        int[] result = new int[max];
        int curTotal = 0;

        while (row >= 0 && col >= 0) {
            for (int i = a; i <= col && curTotal < max; i++) {
                result[curTotal] = matrix[a][i];
                curTotal++;
            }
            a++;
            for (int i = a; i <= row && curTotal < max; i++) {
                result[curTotal] = matrix[i][col];
                curTotal++;
            }
            col--;
            for (int i = col; i >= b && curTotal < max; i--) {
                result[curTotal] = matrix[row][i];
                curTotal++;
            }
            row--;
            for (int i = row; i >= a && curTotal < max; i--) {
                result[curTotal] = matrix[i][b];
                curTotal++;
            }
            b++;
        }
        return result;
    }
}
