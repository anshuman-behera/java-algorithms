package com.anshuman.Dp;

public class knapsack_tabulation {
    public static void main(String args[]) {

        int wt[] = {1,2,4,5};
        int val[] = {5,4,8,6};
        int W=5;

        int n = wt.length;

        System.out.println("The Maximum value of items, thief can steal is "
                +knapsack(wt,val,n-1,W));
    }

    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int dp[][] = new int[n][maxWeight+1];
        // base condition
        // for the weight at zero posation is less then is then we are able to stil it
        for (int i = weight[0]; i <= maxWeight ; i++) {
            dp[0][i] = value[0];
        }
        for (int i = 1; i < n ; i++) {
            for (int j = 0; j <=maxWeight ; j++) {
                int nottake = 0 + dp[i-1][j];
                int taken = Integer.MIN_VALUE;
                if (weight[i] <= j){
                    taken = value[i] + dp[i-1][j-weight[i]];
                }
                dp[i][j] = Math.max(nottake,taken);


            }

        }
        return dp[n-1][maxWeight];
    }

    }
