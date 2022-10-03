package com.anshuman.Dp;

import java.util.Arrays;

public class LisInBinary {
    public static void main(String[] args) {

    }

        public int lengthOfLIS(int[] nums) {

            //Time complexity= O(nlogn)
            //fill the dp array with max values
            int[] dp= new int[nums.length+1];
            dp[0]= Integer.MIN_VALUE;

            for(int i=1; i<dp.length; i++)
                dp[i]= Integer.MAX_VALUE;


            //calculate lis length of each element in nums
            int maxIndex= Integer.MIN_VALUE;
            for(int i=0; i<nums.length; i++)
            {
                int element= nums[i];
                int idx = Arrays.binarySearch(dp, element); //upper bound BS
                if(idx<0)
                    idx= Math.abs(idx)-1;

                dp[idx]=element;
                maxIndex= Math.max(idx,maxIndex);
            }
            return maxIndex;
        }
}
