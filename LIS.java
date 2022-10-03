package com.anshuman.Dp;

import java.util.Arrays;

public class LIS {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(lengthOfLIS(0,-1,nums,dp));

    }
   static int lengthOfLIS(int ind , int pev , int[] nums){
        int n = nums.length;
        if (ind == n) return  0 ;
        // for not take
        int len =  0 + lengthOfLIS(ind+1,pev,nums);
        //take
        if (pev== -1 || nums[ind] > nums[pev]){
        len = Math.max(len,1 + lengthOfLIS(ind +1,ind,nums));
    }
        return len;
}
    static int lengthOfLIS(int ind , int pev , int[] nums,int[][] dp){
        int n = nums.length;
        if (ind == n) return  0 ;
        // for not take
        if (dp[ind][pev+1] != -1) return dp[ind][pev+1];
        int len = 0 + lengthOfLIS(ind+1,pev,nums,dp);
        //take
        if (pev== -1 || nums[ind] > nums[pev]){
            len = Math.max(len,1 + lengthOfLIS(ind +1,ind,nums,dp));
        }
        return dp[ind][pev+1] =len;
    }
}
