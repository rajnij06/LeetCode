package CodeLab;

import java.util.ArrayList;
import java.util.Arrays;

public class MKthLargestElementArray {
    public static void main (String[] args) {
//        int[] nums = {3,2,1,5,6,4}; int k = 2;
        int[] nums = {3,2,3,1,2,4,5,5,6}; int k = 4;
        System.out.println(kthLargest(nums,k));
    }
    public static int kthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
