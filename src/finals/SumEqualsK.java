package finals;

import java.util.HashMap;

public class SumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1,1,1}; int k = 2; //2
//        int[] nums = {1,2,3}; int k = 3; //2
        System.out.println(subarraySum(nums,k));
    }
    static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        map.put(0, 1);
        for (int num : nums) {
            sum = sum + num;
            ans = ans + map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
