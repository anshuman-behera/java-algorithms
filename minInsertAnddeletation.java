package com.anshuman.Dp;

public class minInsertAnddeletation {
    public static void main(String[] args) {

    }
    static int lcs(String s1, String s2){
        int n = s1.length();
        int m = s2.length();


        // declred the dp
        int dp[][] = new int[n+1][m+1];
//        for(int rows[]: dp)
//            Arrays.fill(rows,-1);

        for (int i = 0; i <=n ; i++) {
            dp[i][0] = 0 ;

        }
        for (int i = 0; i <=m ; i++) {
            dp[0][i] = 0 ;

        }
        for (int ind1 = 1; ind1 <=n ; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                if (s1.charAt(ind1-1) == s2.charAt(ind2-1) ){
                    dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
                }
                else
                {
                    dp[ind1][ind2] = 0 + Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
                }

            }

        }
        return dp[n][m];
    }
    static int canYouMake(String str, String ptr){
        return str.length() + ptr.length() - 2 * lcs(str,ptr);

    }
}
