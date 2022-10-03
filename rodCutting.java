package com.anshuman.Dp;

public class rodCutting {
    public static void main(String[] args) {
        int price[] = {2,5,7,8,10};

        int n = price.length;
        int[][] dp = new int[n][n +1];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= n ; j++) {
                dp[i][j] = -1 ;

            }

        }
        System.out.println(cutRod(n-1,n,price,dp));

    }
    static int cutRod(int ind, int n,int price[]) {
        //base case
        if(ind == 0 ){
            return n * price[0];
        }
        int nottake = 0 + cutRod(ind-1 , n , price);
        int take = Integer.MIN_VALUE;
        int rodlen = ind +1;
        if (rodlen <= n){
            take  = price[ind]  +  cutRod(ind,n - rodlen,price);

        }
        return Math.max(nottake,take);


    }
    static int cutRod(int ind, int n,int price[],int[][] dp) {
        //base case
        if(ind == 0 ){
            return n * price[0];
        }
        if (dp[ind][n] != -1) return dp[ind][n];
        int nottake = 0 + cutRod(ind-1 , n , price);
        int take = Integer.MIN_VALUE;
        int rodlen = ind +1;
        if (rodlen <= n){
            take  = price[ind]  +  cutRod(ind,n - rodlen,price);

        }
        return dp[ind][n] =  Math.max(nottake,take);


    }
}
