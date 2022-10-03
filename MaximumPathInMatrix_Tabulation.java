package com.anshuman.Dp;

public class MaximumPathInMatrix_Tabulation {
    public static void main(String[] args) {

    }
    static int getMaxPathSum(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        // create a Dp
        int[][] dp = new int[n][m];

        // enter the first row- base condation
        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];

        }
        for (int i = 1; i < n ; i++) {
            for (int j = 0; j < m; j++) {

                int up = matrix[i][j] + dp[i-1][j];
                int leftD = matrix[i][j];
                if (j-1 >= 0) leftD += dp[i-1][j-1];
                else leftD += (int) Math.pow(-10,9);

                int rightD  = matrix[i][j];
                if (j +1 < m) rightD += dp[i-1][j+1];
                else rightD += (int) Math.pow(-10,9);

                dp[i][j] = Math.max(up,Math.max(leftD,rightD));


            }

        }
        int maxi = Integer.MIN_VALUE;
        for (int j = 0; j < m; j++) {
            maxi = Math.max(maxi,dp[n -1][j]);

        }
        return maxi;
    }

}
