package com.anshuman.Dp;

public class editDistance {
    public static void main(String[] args) {
        String s1 = "horse";
        String s2 = "ros";



    }
//    static int minDistance(String word1,String CharSequence word2;
//        word2);
//         {
//      int i = word1.length();
//      int j = word2.length();
//      int[][] dp = new int[i][j];
//        for (int k = 0; k < i; k++) {
//            for (int l = 0; l < j; l++) {
//                dp[k][l] = -1;
//
//            }
//
//        }
//        return minDistance_helper(i-1,j-1,word1,word2,dp);
//
//    }
//   static int minDistance_helper(int i , int j,String word1, String word2 ){
//        if (i<0){
//            return j +1;
//        }
//        if (j < 0){
//            return i +1;
//        }
//        if (word1.charAt(i) == word2.charAt(j)){
//            return 0 + minDistance_helper(i-1,j-1,word1,word2);
//
//
//        }
//        else {
//            int insert = minDistance_helper(i,j-1,word1,word2);
//            int delete =  minDistance_helper(i-1,j,word1,word2);
//            int replace =  minDistance_helper(i-1,j-1,word1,word2);
//            return Math.min(insert,Math.min(delete,replace));
//        }
//
//    }
//
//    private static int minDistance_helper(int i, int j, String word1, String word2, int[][] dp){
//        if (i<0){
//            return j +1;
//        }
//        if (j < 0){
//            return i +1;
//        }
//        if (dp[i][j] != -1) return dp[i][j];
//        if (word1.charAt(i) == word2.charAt(j)){
//            return dp[i][j] = 0 + minDistance_helper(i-1,j-1,word1,word2,dp);
//
//
//        }
//        else {
//            int insert = minDistance_helper(i,j-1,word1,word2,dp);
//            int delete =  minDistance_helper(i-1,j,word1,word2,dp);
//            int replace =  minDistance_helper(i-1,j-1,word1,word2,dp);
//            return dp[i][j] = Math.min(insert,Math.min(delete,replace));
//        }

    }

