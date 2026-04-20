class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxP = 0;
        while (r < prices.length) {
            int profit = prices[r] - prices[l];
            
            if (profit < 0) {
                l = r;
            }
            
            if (profit > maxP) {
                maxP = profit;
            }

            r = r + 1;
        }

        return maxP;
    }
}
