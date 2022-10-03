package com.anshuman.Dp;

public class Minimum_coin_Elements_tabulation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int x = 7;
        System.out.println(minimumElements(arr,x));
    }
    static int minimumElements(int[] arr, int T){

        int n= arr.length;

        int dp[][]=new int[n][T+1];

        for(int i=0; i<=T; i++){
            if(i%arr[0] == 0)
                dp[0][i] = i/arr[0];
            else dp[0][i] = (int)Math.pow(10,9);
        }

        for(int ind = 1; ind<n; ind++){
            for(int target = 0; target<=T; target++){

                int notTake = 0 + dp[ind-1][target];
                int take = (int)Math.pow(10,9);
                if(arr[ind]<=target)
                    take = 1 + dp[ind][target - arr[ind]];

                dp[ind][target] = Math.min(notTake, take);
            }
        }

        int ans = dp[n-1][T];
        if(ans >=(int)Math.pow(10,9)) return -1;
        return ans;
   }

//    static int minimumElements( int x,int[] num){
//        int n = num.length ;
//        int[][] dp = new int[n][x+1];
//        // base case
//        for (int i = 0; i <= x; i++) {
//            if (i % num[0] == 0 ){
//                dp[0][i] = i/num[0];
//            }
//            else dp[0][i] = (int) Math.pow(10,9);
//        }
//        for (int i = 1; i < n; i++) {
//            for (int j = 0; j <= x; j++) {
//                int nottake = 0 + dp[i -1][j];
//                int take = (int) Math.pow(10,9);
//                if(num[i] <= j){
//                    take = 1 + dp[n][j - num[i]] ;
//                }
//                dp[i][j] = Math.min(nottake,take);
//
//
//
//        }
//        int ans = dp[n-1][x];
//        if (ans >= (int) Math.pow(10,9)) return  -1 ;
//        return ans;
//    }
}
