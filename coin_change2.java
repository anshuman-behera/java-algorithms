package com.anshuman.Dp;

import java.util.Arrays;

public class coin_change2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int value = 4 ;
        int n = arr.length;
        long[][] dp = new long[n][value +1];
        for (long row[]: dp) Arrays.fill(row,-1);
        System.out.println(countWaysToMakeChange(n-1,value,arr,dp));


    }
    static long  countWaysToMakeChange(int n , int value, int denominations[]){
        //base case
        if (n == 0 )
           if (value % denominations[0] == 0){
               return 1 ;
           }
           else return 0 ;


        long notTaken = countWaysToMakeChange(n-1,value,denominations);
        long taken = 0 ;
        if (denominations[n] <= value){
            taken = countWaysToMakeChange(n,value-denominations[n],denominations);

        }
        return notTaken + taken;
    }

    static long  countWaysToMakeChange(int n , int value, int denominations[],long[][]dp){
        //base case
        if (n == 0 ){
            if (value % denominations[0] == 0){
                return 1 ;
            }
            else return 0 ;

        }
        if (dp[n][value] != -1 ) return dp[n][value];
        long notTaken = countWaysToMakeChange(n-1,value,denominations);
        long taken = 0 ;
        if (denominations[n] <= value){
            taken = countWaysToMakeChange(n,value-denominations[n],denominations);

        }
        return dp[n][value] =  notTaken + taken;
    }
}



