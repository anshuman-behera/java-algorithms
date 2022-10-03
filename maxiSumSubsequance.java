package com.anshuman.Dp;

import java.util.ArrayList;
import java.util.Arrays;

public class maxiSumSubsequance {
    //DP 5. Maximum Sum of Non-Adjacent Elements
    public static void main(String[] args) {
//        int ind = 3;
        int[] nums = {2,1,4,9};
        int ind = nums.length;
        int[] dp = new int[ind];
        Arrays.fill(dp,-1);
        System.out.println(maximumNonAdjacentSum_dp(ind-1,nums,dp));
    }
    static int maximumNonAdjacentSum(int ind,int[] nums) {
        /* Write your code here. */
        if (ind == 0) return nums[ind] ;
        if (ind<0) return 0;

        //pick the one element
        int pick = nums[ind] + maximumNonAdjacentSum(ind-2,nums);
        //skeep the element
        int notpick = 0 + maximumNonAdjacentSum(ind-1,nums);

        return Math.max(pick,notpick);
    }
    static int maximumNonAdjacentSum_dp(int ind,int[] nums,int[] dp) {
        if (ind == 0) return nums[ind] ;
        if (ind<0) return 0;
        if (dp[ind] != -1) return dp[ind];

        //pick the one element
        int pick = nums[ind] + maximumNonAdjacentSum_dp(ind-2,nums,dp);
        //skeep the element
        int notpick = 0 + maximumNonAdjacentSum_dp(ind-1,nums,dp);

        return dp[ind] =Math.max(pick,notpick);
    }
}
