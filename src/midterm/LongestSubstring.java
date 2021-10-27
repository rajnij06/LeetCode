package Assignment1;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longest(s));
    }
    public static ArrayList<Character> longest(String s) {
        int maxResult = 0;
        ArrayList<Character> res = new ArrayList<>();
        ArrayList<Character> res1 = new ArrayList<>();
        HashSet<Character> hs = new HashSet<Character>();
        for(int i=0; i<s.length(); i++) {
            hs.clear();
            hs.add(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
                maxResult = maxResult < hs.size() ? hs.size() : maxResult;
                if (hs.contains(s.charAt(j))) {
                    res.add(s.charAt(j));
                    break;
                } else {
                    hs.add(s.charAt(j));
                }
            }
        }
        for (int i=0; i<maxResult; i++) {
            res1.add(res.get(i));
        }
        System.out.println(maxResult);
        return res1;
    }
}