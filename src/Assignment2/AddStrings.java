public class AddStrings {
    public static void main (String[] args) {
        String num1 = "11"; String num2 = "123";
        //String num1 = "456"; String num2 = "77";
        //String num1 = "0"; String num2 = "0";
        //String num1 = "944"; String num2 = "99";
        //String num1 = "9"; String num2 = "9";
        //String num1 = "4556"; String num2 = "1258";
        System.out.println(add(num1,num2));
    }
    public static String add(String num1, String num2){
        int len1 = num1.length()-1;
        int len2 = num2.length()-1;
        int carry=0;
        int sum;
        StringBuffer result = new StringBuffer();
        while (len1>=0 || len2>=0)
        {
            sum=0;
            if (len1>=0){
                sum=sum+num1.charAt(len1)-'0';
            }
            if (len2>=0){
                sum=sum+num2.charAt(len2)-'0';
            }
            sum=sum+carry;
            carry=0;
            if (sum>9) {
                sum=sum%10;
                carry=1;
            }
            result.append(sum);
            len1--; len2--;
        }
        if (carry!=0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
