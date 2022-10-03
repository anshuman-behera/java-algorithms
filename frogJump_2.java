package com.anshuman.Dp;

import java.util.Arrays;

public class frogJump_2 {
    public static void main(String[] args) {

        int[] arr = {30,10,60,10,60,50};
        int n = arr.length ;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        System.out.println(frogJump(n-1, arr,dp));
    }

    static int frogJump(int n, int heights[],int[] dp) {
        int right = Integer.MAX_VALUE;
        int left;
       if (n == 0) return 0;
        if (dp[n] != -1)  return dp[n];
        left = frogJump(n - 1, heights,dp) + Math.abs(heights[n] - heights[n - 1]);
        if (n > 1) {
            right = frogJump(n - 2, heights,dp) + Math.abs(heights[n] - heights[n - 2]);

        }


        return dp[n] =Math.min(left, right);
    }
}
