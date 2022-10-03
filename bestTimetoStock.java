package com.anshuman.Dp;

public class bestTimetoStock {
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        System.out.println(maxProfit(price));

    }
   static int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxprofit = 0 ;
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            int cost = prices[i] - mini;
            maxprofit = Math.max(maxprofit,cost);
            mini = Math.min(mini,prices[i]);

        }
        return maxprofit;

    }
}
