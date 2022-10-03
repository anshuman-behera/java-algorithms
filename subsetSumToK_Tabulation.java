package com.anshuman.Dp;

public class subsetSumToK_Tabulation {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};
        int k=4;
        int n = arr.length;
        System.out.println(subsetSumToK(n,k,arr));

    }
    static boolean subsetSumToK(int n, int k,int[] arr){
        boolean dp[][] = new boolean[n][k+1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = true;

        }
        if (arr[0] <= k){
            dp[0][arr[0]] = true;
        }
        for (int ind = 1; ind < n ; ind++) {
            for (int target = 1; target <=k ; target++) {
                boolean nottaken = dp[ind-1][target];

                boolean taken = false;
                if (arr[ind] <= target) taken = dp[ind-1][target-arr[ind]];

                dp[ind][target] = nottaken || taken;


            }

        }
        return dp[n-1][k];
    }
}
