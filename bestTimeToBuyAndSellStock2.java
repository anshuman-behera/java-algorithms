package com.anshuman.Dp;

import java.util.Arrays;

public class bestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {

        int[] Arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit_start(Arr));

    }

    static int maxProfit_start(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return maxprofit(0, 0, n, prices,dp);


    }

    static int maxprofit(int ind, int buy, int n, int[] prices) {
        if (ind == n) return 0;

        int profit = 0;
        // we can by the stock
        if (buy == 0) {
            profit = Math.max(0 + maxprofit(ind + 1, 0, n, prices), maxprofit(ind + 1, 1, n, prices) - prices[ind]);
        }
        if (buy == 1) {
            // we can sell the stock
            profit = Math.max(0 + maxprofit(ind + 1, 1, n, prices), maxprofit(ind + 1, 0, n, prices) + prices[ind]);
        }
        return profit;
    }

    static int maxprofit(int ind, int buy, int n, int[] prices, int[][] dp) {
        if (ind == n) return 0;
        if (dp[ind][buy] != -1) return dp[ind][buy];

        int profit = 0;
        // we can by the stock
        if (buy == 0) {
            profit = Math.max(0 + maxprofit(ind + 1, 0, n, prices), maxprofit(ind + 1, 1, n, prices) - prices[ind]);
        }
        if (buy == 1) {
            // we can sell the stock
            profit = Math.max(0 + maxprofit(ind + 1, 1, n, prices), maxprofit(ind + 1, 0, n, prices) + prices[ind]);
        }
        return dp[ind][buy] = profit;
    }
}
