package com.anshuman.Dp;

import java.util.Arrays;

public class ninjasTranning {
    public static void main(String[] args) {
        int[][] points = {{10,40,70},
                {20,50,80},
                {30,60,90}};


        int n = points.length;
        int[][] dp = new int[n][4];
        for (int[] row:dp) {
            Arrays.fill(row, -1);
        }
            System.out.println(ninjasTranningDP(n-1,3,points,dp));

        }
//        System.out.println(ninjasTranning(n-1,3,points));


    static int ninjasTranning(int day,int last , int[][] points){
        if (day == 0){
            int maxi = 0 ;
            for (int i = 0; i <=2 ; i++) {
                if (i != last){
                    maxi = Math.max(maxi,points[0][i]);

                }

            }
            return maxi;
        }
        int maxi = 0 ;
        for (int i = 0; i <= 2; i++) {
            if (i != last){
                int active = points[day][i] + ninjasTranning(day-1,i,points);
                maxi = Math.max(maxi,active);
            }

        }
        return maxi;

    }
    static int ninjasTranningDP(int day, int last, int[][] points, int[][] dp){
        if (dp[day][last] != -1) return dp[day][last] ;
        if (day == 0){
            int maxi = 0 ;
            for (int i = 0; i <=2 ; i++) {
                if (i != last){
                    maxi = Math.max(maxi,points[0][i]);

                }

            }
            return dp[day][last] = maxi;
        }
        int maxi = 0 ;
        for (int i = 0; i <= 2; i++) {
            if (i != last){
                int active = points[day][i] + ninjasTranning(day-1,i,points);
                maxi = Math.max(maxi,active);
            }

        }
        return dp[day][last] =  maxi;

    }
}
