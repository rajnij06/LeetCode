import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        //int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        //int[][] matrix = {{1}};
        //int[][] matrix = {{1,2},{3,4}};

        System.out.println("4. " + Arrays.deepToString(rotate(matrix)));
    }
    public static int[][] rotate(int[][] matrix) {
        int r = matrix.length;
        for (int i = 0; i < r/2; i++) {
            for (int j = i; j < r - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[r - 1 - j][i];
                matrix[r - 1 - j][i] = matrix[r - 1 - i][r - 1 - j];
                matrix[r - 1 - i][r - 1 - j] = matrix[j][r - 1 - i];
                matrix[j][r - 1 - i] = temp;
            }
        }
        return matrix;
    }
}
