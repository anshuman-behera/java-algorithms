package com.anshuman.Dp;

import java.util.Arrays;

public class fibonachi {
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(memorazation(n,dp));

    }
    //  recursion way

    static  int fibo(int n ){
        if (n <= 1 ) return n;
        return fibo(n-1) + fibo(n-2);
    }

    // memorazation Method
    static int memorazation(int n ,int[] dp){
        if (n<= 1) return  n;

        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = memorazation(n-1,dp) + memorazation(n-2,dp);


    }
}
