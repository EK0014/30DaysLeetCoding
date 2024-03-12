class Solution {
    public int maxProfit(int[] prices) {
      int profit=0;
        int minimum=prices[0];
        for(int i=1;i<prices.length;i++){
            int diff=prices[i]-minimum;
            if(profit<diff){
                profit = diff;
            }
            if(prices[i]<minimum){
                minimum = prices[i];
            }
        }
        return profit;  
    }
}