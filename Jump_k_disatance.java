package com.anshuman.Dp;

import java.util.Arrays;

public class Jump_k_disatance {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        int n = arr.length;
        int k = 3;
        int[]  dp = new int[n];
        Arrays.fill(dp,-1);
        System.out.println(frogJumpWithK_2(n-1,arr,k,dp));

    }
    static int frogJumpWithK(int n , int[]height ,int k)
    {
        if (n == 0) return 0 ;
        int mmStep = Integer.MAX_VALUE;
        for (int j = 1; j <=k ; j++) {
            if (n-j >=0){
                int jump = frogJumpWithK(n-j,height,k) + Math.abs(height[n] - height[n-j]);
                mmStep = Math.min(mmStep,jump);
            }


        }
        return mmStep;
    }
    static int frogJumpWithK_2(int n , int[]height ,int k,int[] dp){
        if (n== 0) return 0;
        if (dp[n] != -1) return dp[n];
        int mmSteps = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            if (n - j >= 0){
                int jump = frogJumpWithK_2(n-j,height,k,dp) + Math.abs(height[n] -height[n-j]);
                mmSteps = Math.min(mmSteps,jump);

            }

        }
        return dp[n] = mmSteps;
    }
}
