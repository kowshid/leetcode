// Problem: 121
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

package arrays;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        if (prices.length == 1) {
            return 0;
        }

        int maxProfit = 0;
        int buyingPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (buyingPrice > prices[i]) {
                buyingPrice = prices[i];
            } else if (prices[i] - buyingPrice > maxProfit) {
                maxProfit = prices[i] - buyingPrice;
            }
        }

        return maxProfit;
    }
}
