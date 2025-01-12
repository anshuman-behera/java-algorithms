package com.anshuman.Dp;

public class shorstes_common_supersequance {
    public static void main(String[] args) {

    }

    static String shortestSupersequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();


        // declred the dp
        int dp[][] = new int[n + 1][m + 1];
//        for(int rows[]: dp)
//            Arrays.fill(rows,-1);

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;

        }
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 0;

        }
        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                if (s1.charAt(ind1 - 1) == s2.charAt(ind2 - 1)) {
                    dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
                } else {
                    dp[ind1][ind2] = 0 + Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
                }

            }
        }
        int len = dp[n][m];
        String ans = "";
        int i = n;
        int j = m;
        int index = len - 1;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                ans += s1.charAt(i - 1);
                index--;
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                ans += s1.charAt(i - 1);
                i--;
            } else {
                ans += s2.charAt(j - 1);
                j--;
            }
        }
        // adding remaning char which hase left on it
        while (i > 0) {
            ans += s1.charAt(i - 1);
            i--;
        }
        while (j > 0) {
            ans += s2.charAt(j - 1);
            j--;
        }
        String ans2 = new StringBuilder(ans).reverse().toString();
        return ans2;

    }
}
