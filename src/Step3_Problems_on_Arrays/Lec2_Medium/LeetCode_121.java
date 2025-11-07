package Step3_Problems_on_Arrays.Lec2_Medium;

public class LeetCode_121 {
    public int maxProfit(int[] prices) {
        int result=0;
        int buy=prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i]<buy) buy=prices[i];
            else if(prices[i]>buy){
                result=Math.max(result, prices[i]-buy);
            }
        }
        return result;
    }
}
