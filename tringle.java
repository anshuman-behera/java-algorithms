package com.anshuman.Dp;

import java.util.Arrays;

public class tringle {
    public static void main(String[] args) {
        int triangle [][] = {{1},
                {2,3},
                {3,6,7},
                {8,9,6,10}};

        int n = triangle.length;
        int[][] dp = new int[n][n];
        for (int[] row: dp) Arrays.fill(row,-1);

        System.out.println(minimumPathSum(triangle,n,0,0,dp));


    }
    static int minimumPathSum(int[][] triangle, int n,int i , int j ) {
        if (i == n -1){
            return triangle[n-1][j];
        }
        int down = triangle[i][j] + minimumPathSum(triangle,n,i+1,j);
        int digonal = triangle[i][j] + minimumPathSum(triangle,n , i+1,j+1);

        return Math.min(down,digonal);
    }
    static int minimumPathSum(int[][] triangle, int n,int i , int j ,int[][]dp ) {
        if (i == n -1){
            return triangle[n-1][j];
        }
        if (dp[i][j] != -1) return dp[i][j];
        int down = triangle[i][j] + minimumPathSum(triangle,n,i+1,j,dp);
        int digonal = triangle[i][j] + minimumPathSum(triangle,n , i+1,j+1,dp);

        return dp[i][j] = Math.min(down,digonal);
    }
}
