package com.anshuman.Dp;

public class Minimum_coin_Elements {
    public static void main(String[] args) {
        int[]  nums = {1,2,3};
        int x = 7 ;
        int n = 3 ;
        int[][] dp = new int[n][x+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= x; j++) {
                dp[i][j] = -1 ;
            }
        }
        System.out.println(minimumElements(n-1,x,nums,dp));

    }
    static int minimumElements(int n ,  int x,int num[]) {
        // base case
        if (n == 0 ){
            // we have to check that how many number of coin will be use in this

            if (x % num[0] == 0 ) return x/num[0];
            else  return Integer.MAX_VALUE;
        }
        // we have to not pick the element
        int notTake = 0 + minimumElements(n-1,x,num);
        int take = Integer.MAX_VALUE;
        if (num[n] <= x){
            take = 1 + minimumElements(n,x-num[n],num);
        }

        return Math.min(take,notTake);

    }
    static int minimumElements(int n ,  int x,int num[],int[][]dp) {
        // base case
        if (n == 0 ){
            // we have to check that how many number of coin will be use in this

            if (x % num[0] == 0 ) return x/num[0];
            else  return Integer.MAX_VALUE;
        }
        if (dp[n][x] != -1) return dp[n][x];
        // we have to not pick the element
        int notTake = 0 + minimumElements(n-1,x,num);
        int take = Integer.MAX_VALUE;
        if (num[n] <= x){
            take = 1 + minimumElements(n,x-num[n],num);
        }

        return dp[n][x]  = Math.min(take,notTake);

    }
}
