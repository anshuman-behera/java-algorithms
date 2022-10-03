package com.anshuman.Dp;

public class coinchnage2_tabulaition {
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        int target=4;
        System.out.println(countWaysToMakeChange(arr,target));

    }
    static long countWaysToMakeChange(int[] arr, int value){
        int n = arr.length;
        long[][] dp = new long[n][value+1];
        // base case
        for (int i = 0; i <= value; i++) {
            if (i % arr[0] == 0){
                dp[0][i] =1 ;
            }

        }
        for (int ind = 1; ind < n; ind++) {
            for (int target = 0; target <= value ; target++) {
                long notTaken = dp[ind-1][target];
                long take = 0 ;
                if (arr[ind] <= target){
                    take = dp[ind][target - arr[ind]];
                }
                dp[ind][target] = notTaken + take;

            }

        }
        return dp[n-1][value];
    }
}
