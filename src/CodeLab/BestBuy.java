package CodeLab;

public class BestBuy {
    public static void main(String[] args) {
        int[] prices ={7,1,5,3,6,4};
        System.out.println(max(prices));
    }
    public static int max(int[] prices) {
        if(prices==null || prices.length==0)
            return 0;
        int f = prices[0];
        int result = 0;
        for(int i = 1; i < prices.length;i++) {
            int s = prices[i];
            int prof = s - f;
            f = s;
            if(prof > 0) {
                result = result + prof;
            }
        }
        return result;
    }
}
