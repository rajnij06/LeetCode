import javax.xml.stream.FactoryConfigurationError;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";   String t = "add";
        //String s = "foo";   String t = "bar";
        System.out.println(checkIsomorphic(s,t));
    }
    public static boolean checkIsomorphic(String s,String t) {
        if (s.length()!=t.length()) {
            System.out.println("6. Are two strings s and t isomorphic?");
            return false;
        }
        int[] arrays = new int[256];
        int[] arrayt = new int[256];
        for (int i=0; i<s.length(); i++) {
            arrays[s.charAt(i)]++;
            arrayt[t.charAt(i)]++;
            if (arrays[s.charAt(i)]!=arrayt[t.charAt(i)]) {
                System.out.println("6. Are two strings s and t isomorphic?");
                return false;
            }
        }
        System.out.println("6. Are two strings s and t isomorphic?");
        return true;
    }
}
