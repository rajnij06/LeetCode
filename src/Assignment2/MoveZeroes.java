package Assignment2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
//        int[] nums = {0};
//        int[] nums = {0,0,0,3,12};
//        int[] nums = {0,0,0,3,0,0,0};
//        int[] nums = {0,0,0,-3,0,0,-1000};
//        int[] nums = {0,-1000};
        System.out.println(Arrays.toString(movezero(nums)));
    }
    public static int[] movezero(int[] nums) {
        int n=nums.length;
        for (int i=0; i< nums.length; ) {
            if (nums[i] == 0) {
                for (int j=i; j<nums.length-1; j++ ) {
                    nums[j]=nums[j+1];
                }
                n=n-1;
                nums[nums.length-1]=0;
            }
            else { i++; }
            if (n==0) { break; }
        }
        return nums;
    }
}
