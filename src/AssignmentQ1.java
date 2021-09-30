public class AssignmentQ1 {

    public static void main (String[] args) {

        // Test cases
        int nums[] = {1,2,3,2};
        //int nums[] = {1,1,1,1,1};
        //int nums[] = {1,2,3,4,5};

        int sum = 0;
        for ( int i=0; i<nums.length; i++ ) {
            int flag = 0;
            for ( int j=0; j<nums.length; j++ ) {
                if(i != j) {
                    if ( nums[i] == nums[j] ) {
                        flag = 1;
                        break;
                    }
                }
            }
            if ( flag == 0) {
                sum = sum + nums[i];
            }
        }
        System.out.println("1. Sum of all the unique elements : " + sum);
    }
}
