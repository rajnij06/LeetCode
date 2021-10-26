package CodeLab;

//https://leetcode.com/problems/implement-strstr/

public class EmplementstrStr {
    public static void main (String[] args) {
//        String haystack = "aaaaa"; String needle = "bba";
//        String haystack = ""; String needle = "";
//        String haystack = "hello"; String needle = "ll";
        String haystack = "heloll"; String needle = "ll";
        System.out.println(occurrence(haystack, needle));
    }
    public static int occurrence(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int j=0;
        int i =0;
        int val=-1;
        while (j<haystack.length()) {
            if (needle.charAt(i)==haystack.charAt(j)) {
                if (val==-1) {
                    val = j;
                    i++;
                }
                else {
                    if (i!=0) {
                        i--;
                    }
                    //val=-1;
                }
            }
            else if (i!=0) {
                i--;
                j--;
                val=-1;
            }
            j++;
            if (i==needle.length()) {
                break;
            }
        }
        return val;
    }
}
