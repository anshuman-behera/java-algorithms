package com.anshuman.Dp;

import java.util.Arrays;

public class bestTimeToBuyAndSellStock2_Tabulation {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices){
        int n = prices.length;
        int dp[][] = new int[n+1][2];
        for (int row[]:dp){
            Arrays.fill(row,-1);
        }
        //base condation
        dp[n][0]  = dp[n][1] = 0;
        int profit = 0 ;
        for (int ind = n-1; ind >=0 ; ind--) {
            for (int buy = 0; buy <=1 ; buy++) {
                if (buy == 0){
                    // we can buy stock
                    profit = Math.max(0+dp[ind+1][0],dp[ind+1][1] -prices[ind]);
                }
                if (buy ==1 ){
                    profit = Math.max(0+dp[ind+1][1],dp[ind+1][0] +prices[ind]);
                }
                dp[ind][buy] = profit;

            }

        }
        return dp[0][0];
    }
    static int maxprofit(int[] prices){
        int n  = prices.length;
        int[][] dp = new  int[n+2][2];

        for (int ind = n-1; ind >= 0 ; ind--){
            for (int buy = 0 ; buy <= 1 ; buy++){
                int profit = 0 ;
                if (buy == 0 ){
                    profit = Math.max(0+dp[ind+1][0],dp[ind+1][1]- prices[ind]);
                }
                if (buy == 1 ){
                    profit = Math.max(0+dp[ind+1][1],dp[ind+2][0] -prices[ind]);
                }
                dp[ind][buy] = profit;
            }
        }
        return dp[0][0];
    }
}
