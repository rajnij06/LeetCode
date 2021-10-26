package CodeLab;

public class PalindromeII {
    public static void main(String[] args) {
//        String s = "aba"; //true
//        String s = "ababcabca"; //false
//        String s = "abc"; //false
        String s = "abca"; //true
        System.out.println(palin(s));
    }
    public static boolean palin(String s) {
        int len = s.length();
        int mid=len/2;
        if(len%2==1) {
            mid=(len+1)/2 ;
        }
        int i=0;
        int j=len-1;
        int flag = 0;
        while (i<=j) {
            if (s.charAt(i)==s.charAt(j)) {
                i++; j--;
            }
            else if(flag!=0) {
            if (s.charAt(i + 1) == s.charAt(j)) {
                    flag = 1;
                    i = i + 2;
                    j--;
                }
            else if (s.charAt(i) == s.charAt(j - 1)) {
                    flag = 1;
                    i = i++;
                    j = j - 2;
                }
            }
            else if (i==mid-1 && j==mid) {
                if (flag==0) {
                    break;
                }
            }
            else
                return false;
        }
        return true;
    }
}
