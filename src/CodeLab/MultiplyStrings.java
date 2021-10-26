package CodeLab;

import java.util.ArrayList;
import java.util.Collections;

//Multiply Strings	https://leetcode.com/problems/multiply-strings/

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "129";    String num2 = "519";
      //  String num1 = "199";    String num2 = "91";
        System.out.println(multiply(num1, num2));
    }

    public static String multiply(String num1, String num2) {
        int carry=0;
        int z=0;
        int s=0;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();
        for (int j=num2.length()-1; j>=0; j--) {
            int val=0;
            for (int n=0;  n<z; n++) {
                result.add(0);
            }
            for (int i=num1.length()-1; i>=0; i--) {
                val=(num2.charAt(j)-'0')*(num1.charAt(i)-'0')+carry;
                carry=0;
                if (val>9) {
                    carry=val/10;
                    val=val%10;
                }
                result.add(val);
                //val=0;
            }
            if (carry>0) {
                result.add(carry);
            }
            carry=0;
            z++;
            Collections.reverse(result);
            if (j<num2.length()-1) {
                int scarry=0;
                int sum=0;
                s= results.size()-1;
                for (int k = result.size()-1; k>=0; k--) {
                    if (s>=0) {
                        sum = result.get(k) + results.get(s) + scarry;
                    }
                    else {
                        sum = result.get(k) + scarry;
                    }
                    scarry=0;
                    if (sum>9) {
                        sum=sum%10;
                        scarry=1;
                    }
                    result.remove(k);
                    result.add(k,sum);
                    s--;
                }
                results = result;
            }
            results=result;
            result = new ArrayList<>();
        }
        String res = results.toString().replaceAll("[\\[\\]]", "");
        res = res.replaceAll(", ","");
        return res;
    }
}
