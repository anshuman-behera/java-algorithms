package com.anshuman.Dp;

import java.util.Arrays;

public class gridUnique_Path {
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        int[][]dp = new int[m][n];
        for (int[]row:dp){
            Arrays.fill(row,-1);

        }
        System.out.println(gridUniquePathDP(m-1,n-1,dp));

    }
    static  int gridUniquePath(int m , int n){
        // base for the at the end
        if (m == 0 && n == 0) return  1;
        // for the edge case
        if (m < 0 || n < 0) return 0;

        int up = gridUniquePath(m-1,n);
        int left = gridUniquePath(m,n-1);

        return up+ left;


    }
    static  int gridUniquePathDP(int i, int j,int[][]dp) {
        // base for the at the end
        if (i == 0 && j == 0) return  1;
        // for the edge case
        if (i < 0 || j < 0) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int up = gridUniquePathDP(i-1,j,dp);
        int left = gridUniquePathDP(i,j-1,dp);

        return dp[i][j] =up+ left;


    }
}
