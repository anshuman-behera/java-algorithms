package com.anshuman.Dp;

import java.util.Arrays;

public class NumberOfSubSet {
    public static void main(String[] args) {
        int arr[] = {1,3,2};
        int n = arr.length;
        int k=3;
        int dp[][]= new int[n][k+1];

        for(int row[]: dp)
            Arrays.fill(row,-1);
        System.out.println(findWays(n-1,k,arr,dp));

    }
    static int findWays(int ind ,  int tar,int[] nums) {
        if (ind == 0 ){
            if (tar == 0 && nums[0] == 0) return 2 ;
            if (tar == 0 || tar == nums[0]) return  1 ;

            return 0;
        }
        int notTaken = findWays(ind-1,tar,nums);

        int taken = 0 ;
        if (nums[ind] <= tar) {
            taken = findWays(ind-1,tar-nums[ind],nums);
        }
        return notTaken + taken;

    }
    static int findWays(int ind ,  int tar,int[] nums,int[][] dp) {
        if (ind == 0 ){
            if (tar == 0 && nums[0] == 0) return 2 ;
            if (tar == 0 || tar == nums[0]) return  1 ;

            return 0;
        }
        if (dp[ind][tar] != -1 )
            return dp[ind][tar];

        int notTaken = findWays(ind-1,tar,nums);

        int taken = 0 ;
        if (nums[ind] <= tar) {
            taken = findWays(ind-1,tar-nums[ind],nums);
        }
        return dp[ind][tar] = notTaken + taken;

    }

}
