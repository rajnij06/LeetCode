package CodeLab;

//https://leetcode.com/problems/contains-duplicate/

import java.lang.reflect.Array;
import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,1}; //true
//        int[] nums = {1,2,3,4}; //false
        int[] nums = {1,1,1,3,3,4,3,2,4,2}; //true
        System.out.println(dup(nums));
    }
    public static boolean dup(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                if (nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }
}
