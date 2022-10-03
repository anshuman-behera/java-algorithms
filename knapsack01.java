package com.anshuman.Dp;

import java.util.Arrays;

public class knapsack01 {
    public static void main(String[] args) {
        int[] weight = {3,2,5};
        int[] value = {30,40,60};
        int n = 3;
        int W = 6 ;
        int dp[][]= new int[n][W+1];
        for(int row[]: dp)
            Arrays.fill(row,-1);

        System.out.println(knapsack(2,weight,value,6,dp));

    }
    static  int knapsack(int n,int[] weight, int[] value,  int maxWeight){
        //base case
        if (n == 0 ){
            // we have to check that the thief will able to take it or not
            if (weight[0] <= maxWeight){
                return value[0];
            }
            // if it not possiable to take then we have not take the element
            else return 0;
        }
        int nottake = 0 + knapsack(n-1,weight,value,maxWeight);
        int take = Integer.MIN_VALUE;
        if (weight[n] <= maxWeight){
            take = value[n] + knapsack(n-1,weight,value,maxWeight-weight[n]);
        }

        return Math.max(nottake,take);
    }
    static  int knapsack(int n,int[] weight, int[] value,  int maxWeight,int[][] dp){
        //base case
        if (n == 0 ){
            // we have to check that the thief will able to take it or not
            if (weight[0] <= maxWeight){
                return value[0];
            }
            // if it not possiable to take then we have not take the element
            else return 0;
        }

        if (dp[n][maxWeight] != -1) return dp[n][maxWeight];
        int nottake = 0 + knapsack(n-1,weight,value,maxWeight, dp);
        int take = Integer.MIN_VALUE;
        if (weight[n] <= maxWeight){
            take = value[n] + knapsack(n-1,weight,value,maxWeight-weight[n],dp);
        }

        return dp[n][maxWeight] =  Math.max(nottake,take);
    }
}
