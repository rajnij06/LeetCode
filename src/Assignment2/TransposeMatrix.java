import java.util.Arrays;
public class TransposeMatrix {
    public static void main (String[] args) {
        int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] matrix = new int[][] {{1,2,3},{4,5,6}};
//        int[][] matrix = new int[][] {{1,2,3,4,5}};

        System.out.println("1. Thetransposeof a matrix is : \n" +Arrays.deepToString(transpose(matrix)));
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] transmatrix = new int[matrix[0].length][matrix.length];
        int i, j;
        for (i=0; i<matrix.length; i++) {
            for (j=0; j<matrix[0].length; j++) {
                transmatrix[j][i] = matrix[i][j];
            }
        }
        return transmatrix;
    }
}
