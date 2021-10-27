package CodeLab;

import java.util.HashMap;
import java.util.Map;

public class Reconstruct {
    public static void main(String[] args) {
//        String s = "owoztneoer";
        String s = "fviefuro";
        System.out.println(cons(s));
    }
    public static String cons(String s) {
        int[] count = new int[10];
        Map<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        count[0] = hm.getOrDefault('z', 0);
        count[2] = hm.getOrDefault('w', 0);
        count[4] = hm.getOrDefault('u', 0);
        count[6] = hm.getOrDefault('x', 0);
        count[8] = hm.getOrDefault('g', 0);
        count[3] = hm.getOrDefault('h', 0) - count[8];
        count[5] = hm.getOrDefault('f', 0) - count[4];
        count[7] = hm.getOrDefault('s', 0) - count[6];
        count[9] = hm.getOrDefault('i', 0) - count[8] - count[6] - count[5];
        count[1] = hm.getOrDefault('n', 0) - count[7] - 2* count[9];
        StringBuilder res = new StringBuilder();
        for (int i=0; i < 10; i++){
            while (count[i] > 0){
                res.append(i);
                count[i]--;
            }
        }
        return res.toString();
    }
}
