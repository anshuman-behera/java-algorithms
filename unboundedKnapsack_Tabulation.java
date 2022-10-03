package com.anshuman.Dp;

public class unboundedKnapsack_Tabulation {

    public static void main(String[] args) {
        int n = 3;
        int w = 10;
        int[] profit = {5, 11, 13};
        int[] weight = {2, 4, 6};
        System.out.println(unboundedKnapsack(n,w,profit,weight));

    }static int unboundedKnapsack(int n, int w, int[] profit, int[] weight){
        int[][] dp = new int[n][w+1];
        // base case
        for (int i = weight[0]; i <=w ; i++) {
            dp[0][i] =(int) ( i/weight[0]) * profit[0];

        }
        for (int ind = 1; ind < n; ind++) {
            for (int value = 0; value <= w; value++) {
                int nottake = 0+ dp[ind-1][value];
                int take = Integer.MIN_VALUE;
                if (weight[ind]<= value){
                    take = profit[ind] + dp[ind][value-weight[ind]];

                }
                dp[ind][value] = Math.max(nottake,take);

            }

        }
        return dp[n-1][w];
    }

}
