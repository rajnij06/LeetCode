package CodeLab;

//https://leetcode.com/problems/summary-ranges/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
//        int[] nums = {0,1,2,4,5,7}; //["0->2","4->5","7"]
//        int[] nums = {0,2,3,4,6,8,9}; //["0","2->4","6","8->9"]
//        int[] nums = {}; //[]
//        int[] nums = {-1}; //["-1"]
        int[] nums = {0}; //["0"]
        System.out.println(range(nums));
    }
    public static List<String> range(int[] nums) {
        List<String> result = new LinkedList<>();
        for (int i=0; i<nums.length; i++) {
            int start=0;
            int end=0;
            if ((i+1)!=nums.length && nums[i]+1==nums[i+1]) {
                start=nums[i];
                while ((i+1)!=nums.length && nums[i]+1 == nums[i+1]) {
                    end = nums[i+1];
                    i++;
                    if (i == nums.length) {
                        break;
                    }
                }
                String r = "\""+start+"->"+end+"\"";
                result.add(r);
            }
            else {
                String r = "\""+nums[i]+"\"";
                result.add(r);
            }
        }
        return result;
    }
}
