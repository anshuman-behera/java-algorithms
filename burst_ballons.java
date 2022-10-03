package com.anshuman.Dp;

import java.util.ArrayList;
import java.util.Arrays;

public class burst_ballons {
    public static void main(String[] args) {


    }
    public int maxCoins(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int ele:nums){
            list.add(ele);
        }
        list.add(0,1);
        list.add(1);
        int[][] dp = new int[n+1][n+1];
        for (int[] row : dp){
            Arrays.fill(row,-1);
        }
        return f(1,n,list,dp);

    }
    private int f(int i , int j , ArrayList<Integer> nums){
        // base case
        if (i > j ) return  0 ;
        int maxi = Integer.MIN_VALUE;
        for (int ind = i; ind <= j ; ind++) {
            int coins = nums.get(i-1)* nums.get(ind)*nums.get(j+1) + f(i,ind-1,nums) + f(ind+1,j,nums);
            maxi = Math.max(maxi,coins);

        }
        return maxi;
    }
    private int f(int i , int j , ArrayList<Integer> nums,int[][] dp){
        // base case
        if (i > j ) return  0 ;
        if (dp[i][j] != -1) return dp[i][j];
        int maxi = Integer.MIN_VALUE;
        for (int ind = i; ind <= j ; ind++) {
            int coins = nums.get(i-1)* nums.get(ind)*nums.get(j+1) + f(i,ind-1,nums,dp) + f(ind+1,j,nums,dp);
            maxi = Math.max(maxi,coins);

        }
        return dp[i][j] = maxi;
    }
}
