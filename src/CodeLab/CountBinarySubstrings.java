package CodeLab;

public class CountBinarySubstrings {
    public static void main(String[] args) {
        String s = "00110011";
        System.out.println(binary(s));
    }
    public static int binary(String s) {
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int left = i, right = i + 1;
            if (s.charAt(left) == '0') {
                while (s.charAt(left) == '0' && s.charAt(right) == '1') {
                    result++;
                    left--;
                    right++;
                    if (left < 0 || right == s.length())
                        break;
                }
            }
            else {
                while (s.charAt(left) == '1' && s.charAt(right) == '0') {
                    result++;
                    left--;
                    right++;
                    if (left < 0 || right == s.length())
                        break;
                }
            }
        }
        return result;
    }
}
