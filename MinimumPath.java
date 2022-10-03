package com.anshuman.Dp;

import java.util.Arrays;

public class MinimumPath {
    public static void main(String[] args) {
        int matrix[][] = {{5,9,6},{11,5,2}};

        int n = matrix.length;
        int m = matrix[0].length;
        int dp[][]=new int[n][m];
        for(int row[]: dp)
            Arrays.fill(row,-1);
        System.out.println(minSumPath(n-1,m-1,matrix,dp));

    }
    static int minpath(int i , int j ,int[][] arr){

        if (i == 0 && j == 0) return arr[0][0];
        if (i<0 || j < 0) return (int)Math.pow(10,9);
        int up = arr[i][j] + minpath(i-1,j,arr);
        int left = arr[i][j] + minpath(i,j-1,arr);
        return Math.min(up,left);
    }
    static int minSumPath(int i , int j ,int[][] arr,int[][]dp){

        if (i == 0 && j == 0) return arr[0][0];
        if (i<0 || j < 0) return (int)Math.pow(10,9);
        if (dp[i][j] != -1) return dp[i][j];
        int up = arr[i][j] + minpath(i-1,j,arr);
        int left = arr[i][j] + minpath(i,j-1,arr);
        return dp[i][j] = Math.min(up,left);
    }
}
