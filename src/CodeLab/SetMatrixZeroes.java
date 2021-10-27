package CodeLab;

//https://leetcode.com/problems/set-matrix-zeroes/

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
//        int[][] matrix ={{1,1,1},{1,0,1},{1,1,1}}; //[[1,0,1],[0,0,0],[1,0,1]]
        int[][] matrix ={{0,1,2,0},{3,4,5,2},{1,3,1,5}}; //[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
        zero(matrix);
    }
    public static void zero(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if(matrix[i][j]==0) {
                    row.add(i);
                    col .add(j);
                }
            }
        }
        for (int i=0; i<row.size(); i++) {
            int k=row.get(i);
            int l=col.get(i);
            for(int m=0; m<c; m++) {
                matrix[k][m]=0;
            }
            for(int m=0; m<r; m++) {
                matrix[m][l]=0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
