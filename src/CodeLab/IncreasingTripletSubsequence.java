package CodeLab;

//https://leetcode.com/problems/increasing-triplet-subsequence/

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5}; //true
//        int[] nums = {5,4,3,2,1}; //false
//        int[] nums ={2,1,5,0,4,6}; //true
        System.out.println(inc(nums));
    }
    public static boolean inc(int[] nums) {
        int i=0;
        while (i+2<nums.length) {
            if(nums[i]<nums[i+1] && nums[i+1]<nums[i+2]) {
                return true;
            }
            i++;
        }
        return false;
    }
}
