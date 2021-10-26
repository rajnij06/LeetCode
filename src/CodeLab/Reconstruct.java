package CodeLab;

import java.util.*;

public class Reconstruct {
    public static void main(String[] args) {
        String s = "owoztneoer";
        System.out.println(cons(s));
    }
    public static String cons(String s) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        String result;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '$'){ break; }
            if (s.charAt(i)=='z') {
                res.add(0);
                s.replace('z','$');
                s.replace('e','$');
                s.replace('r','$');
                s.replace('o','$');
            }
            if (s.charAt(i)=='w') {
                res.add(2);
                s.replace('t','$');
                s.replace('w','$');
                s.replace('o','$');
            }
            if (s.charAt(i)=='u') {
                res.add(4);
                s.replace('f','$');
                s.replace('o','$');
                s.replace('u','$');
                s.replace('r','$');
            }
            if (s.charAt(i)=='x') {
                res.add(6);
                s.replace('s','$');
                s.replace('i','$');
                s.replace('x','$');
            }
            if (s.charAt(i)=='g') {
                res.add(8);
                s.replace('e','$');
                s.replace('i','$');
                s.replace('g','$');
                s.replace('h','$');
                s.replace('t','$');

            }
        }
        System.out.println(s);
        //1
        //3
        //5
        //7
        //9
        Collections.sort(res);
        return res.toString();
    }
}
