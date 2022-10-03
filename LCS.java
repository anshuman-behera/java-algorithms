package com.anshuman.Dp;

public class LCS {
    public static void main(String[] args) {
        String s = "acd";
        String t = "ced";
        int ind1 = s.length();
        int ind2 = t.length();
        int[][] dp = new  int[ind1][ind2];
        for (int i = 0; i < ind1; i++) {
            for (int j = 0; j < ind1; j++) {
                dp[i][j] = -1;

            }

        }
        System.out.println(lcs(s,t,ind1-1,ind2-1,dp));
    }
    static int lcs(String s, String t, int ind1 , int ind2){
        // base case
        // if the index is going to negative then  this is the end of the string
        if (ind1 < 0 || ind2 < 0){
            return 0 ;
        }
        if (s.charAt(ind1) == t.charAt(ind2)){
            return   1 + lcs(s,t,ind1-1,ind2-1);

        }
        // when the index is not match then we just move the element  we have to kepp one move one for the checking the element one by one
        return  0 + Math.max(lcs(s,t,ind1-1,ind2),lcs(s,t,ind1,ind2-1));
    }

    static int lcs(String s, String t, int ind1 , int ind2 ,int[][] dp){
        // base case
        // if the index is going to negative then  this is the end of the string
        if (ind1 < 0 || ind2 < 0){
            return 0 ;
        }
        if (dp[ind1][ind2] != -1 ) return  dp[ind1][ind2] ;
        if (s.charAt(ind1) == t.charAt(ind2)){
            return dp[ind1][ind2] =   1 + lcs(s,t,ind1-1,ind2-1);

        }
        // when the index is not match then we just move the element  we have to kepp one move one for the checking the element one by one
        return dp[ind1][ind2] =   0 + Math.max(lcs(s,t,ind1-1,ind2),lcs(s,t,ind1,ind2-1));
    }


}
