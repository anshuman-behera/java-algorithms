package com.anshuman.Dp;

public class longestCommonSubstring {
    public static void main(String[] args) {


    }

    static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();


        // declred the dp
        int dp[][] = new int[n + 1][m + 1];
//        for(int rows[]: dp)
//            Arrays.fill(rows,-1);

        int ans = 0;


        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                if (s1.charAt(ind1 - 1) == s2.charAt(ind2 - 1)) {

                    int val = 1 + dp[ind1 - 1][ind2 - 1];
                    dp[ind1][ind2] = val;
                    ans = Math.max(ans, val);
                } else {
                    dp[ind1][ind2] = 0;
                }


            }
        }
        return ans;
    }
}
