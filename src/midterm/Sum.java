package Assignment1;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] array = {1,3,-1,3,4,-1};
//        int[] array = {1,3,-1,3,4,-1,4,-5,7};
        System.out.println(sumr(array));
    }
    public static int sumr(int[] array) {
        int result=0;
        int i=0;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        while (i<array.length) {
            if(i+1<array.length && array[i]==array[i+1]) {
                result=result+array[i];
                i++;
            }
            i++;
        }
        return result;
    }
}