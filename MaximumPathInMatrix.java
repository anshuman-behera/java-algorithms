package com.anshuman.Dp;

import java.util.Arrays;

public class MaximumPathInMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,10,4},
                {100,3,2,1},
                {1,1,20,2},
                {1,2,2,1}};
        int n = matrix.length;
        int m = matrix[0].length;
        int dp[][]= new int[n][m];
        for(int row[]: dp)
            Arrays.fill(row,-1);

        int maxi = Integer.MIN_VALUE;
        for (int j = 0; j < m; j++) {
            int ans = getMaxPathSum(n-1,j,m,matrix,dp);
            maxi = Math.max(maxi,ans);

        }
        System.out.println(maxi);



    }
    static int getMaxPathSum(  int i , int j , int m , int[][] mat ) {
        if (j < 0 || j >= m)
            return (int) Math.pow(-10, 9);
        if (i == 0)
            return mat[0][j];

        int up = mat[i][j] + getMaxPathSum(i - 1, j, m, mat);
        int leftD = mat[i][j] + getMaxPathSum(i - 1, j - 1, m, mat);
        int rightD = mat[i][j] + getMaxPathSum(i - 1, j + 1, m, mat);
        return Math.max(up, Math.max(leftD, rightD));
    }
    static int getMaxPathSum(  int i , int j , int m , int[][] mat,int[][]dp ) {
        if (j < 0 || j >= m)
            return (int) Math.pow(-10, 9);
        if (i == 0)
            return mat[0][j];
        if(dp[i][j] != -1) return dp[i][j];



        int up = mat[i][j] + getMaxPathSum(i - 1, j, m, mat);
        int leftD = mat[i][j] + getMaxPathSum(i - 1, j - 1, m, mat);
        int rightD = mat[i][j] + getMaxPathSum(i - 1, j + 1, m, mat);
        return dp[i][j] = Math.max(up, Math.max(leftD, rightD));
    }

}
