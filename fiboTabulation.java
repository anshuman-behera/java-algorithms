package com.anshuman.Dp;

import java.util.Arrays;

public class fiboTabulation {
    public static void main(String[] args) {
        // tabulation method
        int n = 5 ;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0 ;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];

        }
        System.out.println(dp[n]);
    }
    // here the complexcity is 0(n) and spce complexcity is 0(n)


}
