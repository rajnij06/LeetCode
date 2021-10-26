package CodeLab;

//https://leetcode.com/problems/expressive-words/

public class ExpressiveWords {
    public static void main(String[] args) {
        String s = "heeellooo"; String[] words = {"hello", "hi", "helo"}; // 1
//        String s = "zzzzzyyyyy"; String[] words = {"zzyy","zy","zyy"}; // 3
        System.out.println(expressive(s, words));
    }
    public static int expressive(String s, String[] words) {
        int lens = s.length();
        int word_c=0;
        for (int i=0; i<words.length; i++) {
            String w=words[i];
            int lenw=words[i].length();
            int k=0;
            int count=0;
            for (int j=0; j<lenw; j++) {
                count=0;
                while (k < lens) {
                    if(j+1<w.length() && w.charAt(j)==w.charAt(j+1)) {
                        if(k+2<s.length() && j+2<w.length() && s.charAt(k)==s.charAt(k+1) && s.charAt(k+2)==w.charAt(j+2))
                            k++;
                        j++;
                        char x=w.charAt(j);
                        if(k+4<s.length() && x == s.charAt(k) && x ==s.charAt(k+1) && x == s.charAt(k+2) && x == s.charAt(k+3) && x == s.charAt(k+4)) {
                            count = 5;
                            k = k + 5;
                            break;
                        }
                        else {
                            k++;
                            break;
                        }
                    }
                    else if (w.charAt(j) == s.charAt(k) && w.charAt(j) == s.charAt(k + 1) && w.charAt(j) == s.charAt(k + 2)) {
                        while (k<s.length() && w.charAt(j) == s.charAt(k)) {
                            count++;
                            k++;
                        }
                        count++;
                        break;
                        }
                        else if (w.charAt(j) == s.charAt(k)) {
                            count = 1;
                            k++;
                            break;
                        }
                        else {
                            k++;
                            break;
                        }
                    }

                }
            if (count != 0) {
                word_c++;
            }
        }
        return word_c;
    }
}
