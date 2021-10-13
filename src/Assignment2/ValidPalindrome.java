package Assignment2;

import java.security.SecureRandom;
import java.util.ArrayList;

public class ValidPalindrome {
    public static void main (String[] args) {
//      String s = "A man, a plan, a canal: Panama";
        String s = "race a car";
        System.out.println(palindrome(s));
    }
    public static boolean palindrome(String s) {
        s=s.toLowerCase();
        ArrayList arr = new ArrayList();
        int i=0;
        while (i<s.length()) {
            if (Character.isLetterOrDigit(s.charAt(i)) == true) {
                arr.add(s.charAt(i));
            }
            i++;
        }
        int arrSize = arr.size()-1;
        int m = 0; int n = arrSize;
        while (m < n) {
            if (arr.get(m) != arr.get(n)) {
                return false;
            }
            m++;
            n--;
        }
        return true;
    }
}
