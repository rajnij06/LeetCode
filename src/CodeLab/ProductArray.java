package CodeLab;

//https://leetcode.com/problems/product-of-array-except-self/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ProductArray {
    public static void main(String[] args) {
//        int[] nums ={1,2,3,4}; //24,12,8,6
        int[] nums ={-1,1,0,-3,3}; //0,0,9,0,0
        System.out.println(prod(nums));
    }
    public static List<Integer> prod(int[] nums) {
        List<Integer> result = new LinkedList<>();
        int len = nums.length;
        for (int i=0; i<len; i++) {
            int temp=nums[i];
            nums[i]=1;
            for (int j=0; j<len; j++) {
                if (j+1<len && j==i)
                    j++;
                if (i!=j)
                    nums[i]=nums[i]*nums[j];
            }
            result.add(i,nums[i]);
            nums[i]=temp;
        }
        return result;
    }
}
