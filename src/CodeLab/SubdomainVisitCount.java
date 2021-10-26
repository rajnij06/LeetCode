package CodeLab;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubdomainVisitCount {
    public static void main(String[] args) {
        String[] cpdomains = {"9001 discuss.leetcode.com"};
        System.out.println(visit(cpdomains));
    }
    public static List<String> visit(String[] cpdomains) {
        List<String> result = new LinkedList<>();
        String[] s =cpdomains[0].split("[ .]");
        if (s.length == 3) {
            result.add(s[0] + " " + s[1] + "." + s[2]);
            result.add(s[0] + " " + s[2]);
        }
        else if (s.length == 4) {
            result.add(s[0] + " " + s[1] + "." + s[2] + "." + s[3]);
            result.add(s[0] + " " + s[2] + "." + s[3]);
            result.add(s[0] + " " + s[3]);
        }
        return result;
    }
}
