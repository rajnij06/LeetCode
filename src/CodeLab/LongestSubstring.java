package CodeLab;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s ="abcabcbb"; //3
//        String s ="pwwkew"; //3
//        String s ="bbbbb"; //1
//        String s =""; //0
        System.out.println(longest(s));
    }
    public static int longest(String s) {
        int maxResult = 0;
        HashSet<Character> hs = new HashSet<Character>();
        for(int i=0; i<s.length(); i++) {
            hs.clear();
            hs.add(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
                maxResult = maxResult < hs.size() ? hs.size() : maxResult;
                if (hs.contains(s.charAt(j))) {
                    break;
                } else {
                    hs.add(s.charAt(j));
                }
            }
        }
        return maxResult;
    }
}
