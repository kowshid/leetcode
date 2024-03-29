// Problem: 122
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

package arrays;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit += (prices[i] - prices[i-1]);
            }
        }

        return profit;
    }
}