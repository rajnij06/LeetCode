public class AssignmentQ3 {

    public static void main (String[] args) {

        int arr[] = {2,3,4,2,2,3,5,7};

        int flag2 = 0;
        for ( int i=0; i<arr.length; i++ ) {
            int flag1 = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        flag1 = 1;
                        break;
                    }
                }
            }
            if (flag1 == 0) {
                System.out.println("3. First non repeated integer in an array : " + arr[i]);
                flag2 = 1;
                break;
            }
        }
        if ( flag2 == 0) {
            System.out.println("3. There is no non repeated integer in this array");
        }
    }
}
