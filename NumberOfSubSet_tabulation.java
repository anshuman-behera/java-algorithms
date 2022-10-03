package com.anshuman.Dp;
public class NumberOfSubSet_tabulation
{
    public static void main(String[] args) {
        int[] num = {1,2,2,3};
        int n = num.length;
        int tar = 3;
//        System.out.println(numberofway(0,tar,n,num));
        int dp[][] = new int[n][tar + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= tar; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(numberOfWays(0, tar, n, num, dp));



    }
    static int numberofway(int i , int sum , int n , int[] num){
        // if the sum is invalid
        if (sum < 0) return 0 ;
        // when we reached at the end then we have to put the condation that
        if (i == n ){
            if (sum == 0 ) return 1 ;
            return  0 ;
        }
        if (sum == 0 ) return  1 ;
        // take the element
        int ans = numberofway(i +1,sum - num[i],n,num);

        ans = (ans + numberofway(i +1 ,sum ,n,num));

        return ans;
    }
    static int numberOfWays(int i, int sum, int n, int[] num, int[][] dp) {
        // Not a valid case as sum becomes greater than what we want.
        if (sum < 0) {
            return 0;
        }

        // If we traverse the whole array.
        if (i == n) {
            // Sum becomes equal to the target sum.
            if (sum == 0) {
                return 1;
            }
            return 0;
        }

        // Sum becomes equal to the target sum.
        if (sum == 0) {
            return 1;
        }

        // Return the value if we already have calculated.
        if (dp[i][sum] != -1) {
            return dp[i][sum];
        }

        // If we take the ith element.
        int ans = numberOfWays(i + 1, sum - num[i], n, num, dp);

        // If we do not take the ith element.
        ans = (ans + numberOfWays(i + 1, sum, n, num, dp));

        // Store the answer in dp and then return.
        dp[i][sum] = ans;
        return ans;
    }
}