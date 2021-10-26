public class AssignmentQ5 {

    public static void main (String[] args) {

        // Test cases
        String str = "1A3d4s5t";
        //String str = "a1A3d4s5t";
        //String str = "A2bb2d4";
        //String str = "1A2bb2d4";

        int i = 1;
        if (Character.isDigit(str.charAt(0))) {
            i = 0;
        }
        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                i = i + 2;
            } else {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
