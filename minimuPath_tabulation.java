package com.anshuman.Dp;

public class minimuPath_tabulation {
    public static void main(String args[]) {

        int matrix[][] = {{5,9,6},{11,5,2}};

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println(minSumPath(n,m,matrix));
    }
    static int minSumPath(int n, int m, int[][] matrix){

        int dp[][]=new int[n][m];

        for(int i=0; i<n ; i++){
            for(int j=0; j<m; j++){
                if(i==0 && j==0) dp[i][j] = matrix[i][j];
                else{

                    int up = matrix[i][j];
                    if(i>0) up += dp[i-1][j];
                    else up += (int)Math.pow(10,9);

                    int left = matrix[i][j];
                    if(j>0) left+=dp[i][j-1];
                    else left += (int)Math.pow(10,9);

                    dp[i][j] = Math.min(up,left);
                }
            }
        }

        return dp[n-1][m-1];

    }
}
//    public static void main(String[] args) {
//        int matrix[][] = {{5,9,6},{11,5,2}};
//
//        int n = matrix.length;
//        int m = matrix[0].length;
//        int dp[][]=new int[n][m];
//        System.out.println(minSumpath(n,m,matrix,dp));
//
//
//    }
//    static int minSumpath(int n, int m,int[][] arr,int[][] dp) {
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (i == 0 && j == 0){
//                   dp[i][j] = arr[0][0];
//                }
//                else{
//                    int up = 0 ;
//                    int left = 0 ;
//                    if(i>0 ){
//                        up += dp[i-1][j];
//
//                    }
//                    else up += (int) Math.pow(10,9);
//                    if (j > 0){
//                        left += dp[i][j-1];
//                    }
//                    else  left += (int) Math.pow(10,9);
//                    dp[i][j] =Math.min(up,left);
//                }
//
//            }
//
//        }
//        return dp[n-1][m-1];
//
//    }
//}

