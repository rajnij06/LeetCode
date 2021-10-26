package CodeLab;

import java.util.Arrays;

// https://leetcode.com/problems/string-compression/

public class StringCompression {
    public static void main (String[] args) {

        char[] chars= {'a','a','b','b','c','c','c'};
//        char[] chars= {'a'};
//        char[] chars= {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        //char[] chars= {'a','a','a','b','b','a','a'};
//        char[] chars={'a','a','a','a','#'};
//        char[] chars={'a','a','a','a','#', '&'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars){
        String s="";
        int k=0;
        if (chars.length==1) {
            s=s+chars[0];
            k=1;
        }
        else {
            int i = 0;
            int j = 1;
            while (i < chars.length) {
                s = "";
                s = s + chars[i];
                while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                    j++;
                    i++;
                }
                if (j > 1) {
                    s = s + j;
                }
                i++;
                j = 1;
                for (int l = 0; l < s.length(); l++) {
                    chars[k] = s.charAt(l);
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(chars));
        return k;
    }
}
