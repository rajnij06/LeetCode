public class ReverseWords {
    public static void main (String[] args) {
//        String s = "the sky is     blue";
//        String s = "  hello world   ";
//        String s = "a good   example";
//        String s = "  Bob    Loves  Alice   ";
        String s = "Alice does not even like bob";
        System.out.println("\"" + reverse(s) + "\"");
    }
    public static String reverse(String s) {
        String[] arr = s.split("\\s+");
        StringBuffer res = new StringBuffer();
        for (int i = arr.length - 1; i >= 0; i--) {
            res.append(arr[i]);
            res.append(" ");
        }
        String result = res.toString().trim();
        return result;
    }
}
