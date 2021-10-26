package CodeLab;

import java.util.Arrays;

//Merge Sorted Array	https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1}; int[] num2 = {};
//        int[] num1 = {0}; int[] num2 = {1};
//        int[] num1 = {1, 3, 8, 0, 0, 0, 0}; int[] num2 = {2, 4, 4, 7};
        System.out.println(Arrays.toString(mergeSort(num1, num2)));
    }

    public static int[] mergeSort(int[] num1, int[] num2) {
        int len = 0;
        int j;
        for (int i = 0; i < num2.length; i++) {
            for (j = 0; j < num1.length; j++) {
                if (num2[i]<=num1[j] && num2[i]>num1[j-1]) {
                    int val=num1.length-1;
                    System.out.println("yes");
                    while (val>j) {
                        num1[val]=num1[val-1];
                        val--;
                    }
                    num1[j]=num2[i];
                    break;
                }
                else if(num1[j]==0){
                    num1[j]=num2[i];
                    break;
                }
            }
        }
        return num1;
    }
}
