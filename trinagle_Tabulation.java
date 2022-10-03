package com.anshuman.Dp;

public class trinagle_Tabulation {
    public static void main(String[] args) {

    }
    static int minimumPathSum(int[][] triangle, int n) {
        int dp[][]= new int[n][n];
        // base case when we reach to the end we have 4 possiablity

        for (int j = 0; j < n; j++) {
            dp[n-1][j] = triangle[n-1][j];
        }
        for (int i = n-2; i >= 0 ; i--) {
            for (int j = i; j >=0; j--) {
                int down = triangle[i][j] + dp[i+1][j];
                int digonal = triangle[i][j] + dp[i+1][j+1];

                dp[i][j] = Math.min(down,digonal);

            }

        }
        return dp[0][0];
    }
}
