package com.anshuman.Dp;

import java.util.Arrays;

public class maxiSumSequance_Tabulation {
    public static void main(String[] args) {
        int[] arr = {2,1,4,9};
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
//        System.out.println(maxiSumSequance_Tabulation(n,arr,dp));
        System.out.println(spaceOptimazation(n,arr));

    }
    static  int maxiSumSequance_Tabulation(int n , int[] nums,int[] dp){
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            int pick = nums[i];
            if (i >1) pick += dp[i-2];
            int nonpick = 0+ dp[i-1];

            dp[i] = Math.max(pick,nonpick);

        }
        return dp[n-1];
    }
    // space Optimization
    static int spaceOptimazation(int n , int[] arr){
        int prev =arr[0];
        int prev2 = 0;
        for (int i =1; i <n; i++) {
            int take = arr[i];
            if (i>1) take += prev2;
            int nontake = 0+ prev;

            int curi = Math.max(take,nontake);
            prev2 = prev;
            prev = curi;

        }
        return prev;
    }

}
