package com.anshuman.Dp;

import java.util.Arrays;

public class subsetSumEqalsToTarget {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int k=4;
        int n = arr.length;
        int dp[][]=new int[n][k+1];
        for(int row[]: dp)
            Arrays.fill(row,-1);
        System.out.println(subsetSumToK(n-1,k,arr,dp));


    }
    static boolean subsetSumToK(int n, int k, int arr[]){
        if (k == 0 ) return true;
        if (n == 0) return arr[0] == k;

        boolean nottake = subsetSumToK(n-1,k,arr);
        boolean take = false;
        if (arr[n] <= k){
            take = subsetSumToK(n-1,k - arr[n],arr);

        }
        return nottake || take;
    }
    static boolean subsetSumToK(int n, int k, int arr[],int[][]dp){
        if (k == 0 ) return true;
        if (n == 0) return arr[0] == k;
        // dparr[0] == k;2
        if (dp[n][k] != -1) return dp[n][k] == 0 ?false:true;


        boolean nottake = subsetSumToK(n-1,k,arr);
        boolean take = false;
        if (arr[n] <= k){
            take = subsetSumToK(n-1,k - arr[n],arr);
            dp[n][k] = nottake ||take ?1:0;

        }
        return nottake || take;
    }
}
