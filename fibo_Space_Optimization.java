package com.anshuman.Dp;

public class fibo_Space_Optimization {
    public static void main(String[] args) {
        int n = 10;
        int prev2 = 0 ;
        int prev = 1;
        for (int i = 2; i <= n; i++) {
            int cur_i = prev2 + prev;
            prev2 = prev;
            prev = cur_i;

        }
        System.out.println(prev);

    }
}
