package CodeLab;

//https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
//        int[] nums = {3,0,1};
//        int[] nums = {0,1};
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missing(nums));
    }
    public static int missing(int[] nums) {
        int missing=0;
        Arrays.sort(nums);
        int len = nums.length;
        for (int i=0; i<len; i++) {
            if(nums[i]!=i)
                missing=i;
            if (nums[len-1]!=len)
                missing=len;
        }
        return missing;
    }
}
