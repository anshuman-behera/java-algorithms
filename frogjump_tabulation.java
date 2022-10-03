package com.anshuman.Dp;

import java.util.Arrays;

public class frogjump_tabulation {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 10};
        int n = arr.length;
        int[] dp = new int[n + 1];

        System.out.println(frogJump(n - 1, arr));
    }

    static int frogJump(int n, int heights[]) {
        int dp[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        // Already at last stair.
        dp[n] = 0;
        // Only choice to take a single gap jump.
        dp[n - 1] = Math.abs(heights[n - 2] - heights[n - 1]);

        for (int i = n - 2; i > 0; i--) {

            int oneJump = dp[i + 1] + Math.abs(heights[i - 1] - heights[i]);
            int twoJump = dp[i + 2] + Math.abs(heights[i - 1] - heights[i + 1]);

            dp[i] = Math.min(oneJump, twoJump);
        }

        int ans = dp[1];
        return ans;
    }
    //top to down  my approch


    static int frogJump2(int n, int heights[], int[] dp) {
        int right = Integer.MAX_VALUE;
        if (n == 0) return 0;
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int left = dp[n - 1] + Math.abs(heights[n] - heights[n - 1]);
            if (n > i) {
                right = dp[n - 2] + Math.abs(heights[n] - heights[n - 2]);
            }
            dp[n] = Math.min(left, right);


        }
        return dp[n];

//    }
    }
}

