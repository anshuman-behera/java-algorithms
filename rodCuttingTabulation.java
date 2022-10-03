package com.anshuman.Dp;

public class rodCuttingTabulation {
    public static void main(String[] args) {
        int price[] = {2,5,7,8,10};

        int n = price.length;
        System.out.println(cutRod(price,n));

    }
    static int cutRod(int price[], int n ){
        int[][] dp = new int[n][n +1];
        //base case 
        for (int i = 0; i <= n; i++) {
            dp[0][n] = i * price[0];
            
        }
        for (int ind = 1; ind < n; ind++) {
            for (int len = 0; len <=n ; len++) {
                int nottake =  0 + dp[ind-1][len];
                int take = Integer.MIN_VALUE;
                int rodlen = ind +1 ;
                if (rodlen <= len){
                    take = price[ind]  + dp[ind][len - rodlen];
                }
                dp[ind][len] = Math.max(nottake,take);

            }

        }
        return dp[n-1][n];
        
    }

}
