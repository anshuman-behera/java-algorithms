package com.anshuman.Dp;

public class MCM {
    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50};
        int N = arr.length;
        int[][] dp = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                dp[i][j] = -1 ;

            }

        }
        System.out.println(mcm(1,N-1,arr,dp));


    }
    static int mcm(int i , int j , int[] arr,int[][]dp){
        //base case

        if (i == j) return  0  ;
        if (dp[i][j] != -1)return dp[i][j];
        int mini = Integer.MAX_VALUE;
        for (int k = i; k < j ; k++) {
            int step = arr[i-1]*arr[k]*arr[j] + mcm(i,k,arr,dp) + mcm(k+1,j,arr,dp);
            if (step <mini) mini = step;

        }
        return dp[i][j] =mini;
    }
}
