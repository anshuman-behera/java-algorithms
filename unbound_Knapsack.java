package com.anshuman.Dp;

public class unbound_Knapsack {
    public static void main(String[] args) {
        int n = 3;
        int w = 10;
        int[] profit = {5, 11, 13};
        int[] weight = {2, 4, 6};
        int[][] dp = new int[n][w + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= w; j++) {
                dp[i][j] = -1;

            }
        }


        System.out.println(unboundedKnapsack(n - 1, w, profit, weight, dp));

    }

    static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // base case
        if (n == 0) {
            // first we have to find out how manytime thife will able to put it
            // numberof time = total/wt[0]
            return (w / weight[0]) * profit[0];
        }


        //we are able to take the element or not take the element
        int nottake = 0 + unboundedKnapsack(n - 1, w, profit, weight);
        int take = Integer.MIN_VALUE;

        if (weight[n] <= w) {
            take = profit[n] + unboundedKnapsack(n, w - weight[n], profit, weight);
        }
        return Math.max(take, nottake);


    }

    static int unboundedKnapsack(int n, int w, int[] profit, int[] weight, int[][] dp) {
        // base case
        if (n == 0) {
            // first we have to find out how manytime thife will able to put it
            // numberof time = total/wt[0]
            return (w / weight[0]) * profit[0];
        }
        if (dp[n][w] != -1) return dp[n][w];


        //we are able to take the element or not take the element
        int nottake = 0 + unboundedKnapsack(n - 1, w, profit, weight);
        int take = Integer.MIN_VALUE;

        if (weight[n] <= w) {
            take = profit[n] + unboundedKnapsack(n, w - weight[n], profit, weight);
        }
        return dp[n][w] = Math.max(take, nottake);


    }
}
