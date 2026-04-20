class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxP = 0;

        for (int sell: prices) {
            maxP = Math.max(sell - minBuy, maxP);
            minBuy = Math.min(minBuy, sell);
        }

        return maxP;
    }
}
