package com.anshuman.Dp;

public class frogJump {
    public static void main(String[] args) {
        int n = 2;
        int[] arr = {10, 20, 30};
        System.out.println(frogJump(n, arr));
    }

    static int frogJump(int n, int heights[]) {
        int right = Integer.MAX_VALUE;
        int left;
        if (n == 0) {
            return 0;
        }
       left = frogJump(n - 1, heights) + Math.abs(heights[n] - heights[n - 1]);
        if (n > 1) {
            right = frogJump(n - 2, heights) + Math.abs(heights[n] - heights[n - 2]);

        }


        return Math.min(left, right);
    }
}

