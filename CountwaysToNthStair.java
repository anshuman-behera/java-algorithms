package com.anshuman.Dp;

import java.util.Arrays;

public class CountwaysToNthStair {
    public static void main(String[] args) {
       int n = 5;
        int[]dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(countDistinctWayToClimbStair(n,dp));

    }
    static int countDistinctWayToClimbStair(int nStairs,int[] dp){
        if(nStairs == 0) return 1 ;
        if(nStairs == 1) return 1 ;
//        if(nStairs == 2) return 2 ;
        if( dp[nStairs] != -1){
            return dp[nStairs];

        }
        return dp[nStairs] = countDistinctWayToClimbStair(nStairs -1,dp) +
                countDistinctWayToClimbStair(nStairs -2,dp);

    }
}
