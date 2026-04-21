class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxP = 0;
        while(sell < prices.length && buy  < prices.length)
        {
            int p = 0;
            if(prices[buy] <= prices[sell])
            {
                p = prices[sell] - prices[buy];
                sell++;
            }
            else
            {
                buy=sell; sell++;
            }
            maxP = Math.max(maxP,p);

        }
        return maxP;
    }
}
