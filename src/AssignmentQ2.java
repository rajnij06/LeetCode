import java.util.Arrays;

public class AssignmentQ2 {
    public static void main (String[] args) {

        // Test cases
        //int nums[] = { -4,-1,0,3,10 };
        int nums[] = { -7,-3,2,3,11 };

        for ( int i=0; i<nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        for (  int i=0; i<nums.length; i++ ) {
            for ( int j=i+1; j<nums.length; j++) {
                int temp;
                if ( nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("2. Squares of each number sorted in non-decreasing order : ");
        System.out.print(Arrays.toString(nums)); }
}