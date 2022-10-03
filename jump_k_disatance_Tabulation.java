package com.anshuman.Dp;

import java.util.Arrays;

public class jump_k_disatance_Tabulation {
    public static void main(String args[]) {

        int height[]={30,10,60 , 10 , 60 , 50};
        int n=height.length;
        int k=2;
        System.out.println(solve(n,height,k));
    }
    static int solve(int n, int[] height , int k){
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solveUtil(n, height, dp, k);
    }
    static int solveUtil(int n, int[] height, int[] dp, int k){
        dp[0]=0;
        for(int i=1;i<n;i++){
            int mmSteps = Integer.MAX_VALUE;

            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    int jump = dp[i-j]+ Math.abs(height[i]- height[i-j]);
                    mmSteps= Math.min(jump, mmSteps);
                }
            }
            dp[i]= mmSteps;
        }
        return dp[n-1];

    }
}

//    public static void main(String[] args) {
//        int[] arr = {30,10,60,10,60,50};
//        int n = arr.length ;
//        int k = 2;
//        int[] dp = new int[n+1];
//        dp[0] = 0;
//        for (int i = 1; i <n; i++) {
//            int minstep = Integer.MAX_VALUE;
//            for (int j = 1; j < k ; j++) {
//                int jump = 0;
//                if (i - j >= 0) {
//                    jump = dp[i - j] + Math.abs(arr[i] - arr[i - j]);
//
//
//                    minstep = Math.min(minstep, jump);
//
//                }
//            }
//            dp[i] = minstep;
//
//        }
//        System.out.println(dp[n-1]);
//
//
//    }


