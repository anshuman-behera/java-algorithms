package com.anshuman.Dp;

import java.util.Arrays;

public class BestTimetoBuyAndsellWithcollDown {
    public int maxProfit(int[] prices){
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int row[]:dp){
            Arrays.fill(row,-1);

        }
        return colldown(0,1,prices,dp);
    }
    private int colldown(int  ind ,int buy ,int[] prices,int[][] dp ){
        if (ind >= prices.length) return  0 ;
        if (dp[ind][buy] != -1) return dp[ind][buy];
        int profit = 0 ;
        if (buy == 1 ){
           profit = Math.max(colldown(ind+1,0,prices,dp) - prices[ind],0+colldown(ind+1,1,prices,dp));

        }
        //ind = n-1
    profit = Math.max(prices[ind] + colldown(ind+2,1,prices,dp),0+colldown(ind+1,0,prices,dp) );
        return dp[ind][buy] = profit;
    }

}
