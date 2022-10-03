package com.anshuman.Dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class longestDivisiableSubset {
    public static void main(String[] args) {

    }
    public List<Integer> largestDivisibleSubset(int[] nums){
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        // fill the array by 1 because the mini number of every element is 1
        Arrays.fill(dp,1);
        int max = 1 ;
        int prev = nums[0];

        for (int i = 1; i < nums.length ; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] <= dp[j]){
                    dp[i] = dp[j] +1;


                    if (max <dp[i]){
                        max = dp[i];
                        prev = nums[i];
                    }
                }

            }

        }
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (max== dp[i] && prev % nums[i] == 0 ){
                list.add(nums[i] );
                max -= 1;
                prev = nums[i];
            }

        }
        return list;
    }

}
