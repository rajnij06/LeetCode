package CodeLab;

//https://leetcode.com/problems/rotate-array/

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7}; int k =3; //[5,6,7,1,2,3,4]
//        int[] nums = {-1,-100,3,99}; int k =2; //[3,99,-1,-100]
            rotate(nums, k);
    }
    public static void rotate(int[] nums, int k) {
        int i=0;
        while (i<k) {
            int j=nums.length-1;
            int temp = nums[j];
            while (0<j) {
                nums[j]=nums[j-1];
                j--;
            }
            nums[0]=temp;
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
