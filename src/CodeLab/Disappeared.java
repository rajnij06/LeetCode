package CodeLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Disappeared {
    public static void main(String[] args) {
        int[] nums = {1,1};
//        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(disp(nums));
    }
    public static List<Integer> disp(int[] nums) {
        List<Integer> result = new LinkedList<>();
        Arrays.sort(nums);
        for (int i=1; i<=nums.length; i++) {
            int flag = -1;
            for (int j=i-1; j<nums.length; j++) {
                if (nums[j]!=i) {
                    flag = 1;
                }
                else {
                    flag = 0;
                    break;
                }
            }
            if (flag==1) {
                result.add(i);
            }
        }
        return result;
    }
}
