package com.anshuman.Dp;

import java.util.Arrays;

public class minCostClimbing {
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int n = cost.length;
        int[] dp = new  int[n];
        Arrays.fill(dp,-1);

//       minCostClimbingStairs(cost,0,dp);
//       System.out.println(Math.min(dp[0],dp[1]));

    }
   static int minCostClimbingStairs(int[] cost,int ind) {
        if (ind >= cost.length){
            return 0 ;

        }
        int first = minCostClimbingStairs(cost,ind +1);
        int second = minCostClimbingStairs(cost,ind +2);
        return cost[ind] + Math.min(first,second);
   }
    static int minCostClimbingStairs(int[] cost,int ind,int[]dp) {
        if (ind >= cost.length){
            return 0 ;

        }
        if (dp[ind] != -1 ) return  dp[ind];
        int first = minCostClimbingStairs(cost,ind +1,dp);
        int second = minCostClimbingStairs(cost,ind +2,dp);
        dp[ind] =  Math.min(first,second);
       return cost[ind] + dp[ind];
    }
    public int minCostClimbingStairs(int[] cost){
        int[] dp = new int[cost.length +2];
        for (int i = cost.length-1; i  >= 0 ; i--) {
            dp[i] = Math.min(dp[i+1],dp[i+2]) + cost[i];


        }
        return Math.min(dp[0],dp[1] );
    }



}
