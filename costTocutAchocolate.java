package com.anshuman.Dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class costTocutAchocolate {
    public static void main(String[] args) {


    }

        public int minCost(int n, int[] cuts) {
            int len = cuts.length;
            int[][] dp = new int[len+1][len+1];
            for (int[] row :dp){
                Arrays.fill(row,-1);
            }

            ArrayList<Integer> list = new ArrayList<>();
            for (int ele: cuts) {
                list.add(ele);
            }
            list.add(n);
            list.add(0, 0);
            Collections.sort(list);

            return f(1, len, list,dp);
        }

        private int f(int i, int j, ArrayList<Integer> cuts,int[][] dp) {

            // Base Case
            if (i > j) {
                return 0;
            }
            if (dp[i][j] != -1) return dp[i][j];

            int mini = Integer.MAX_VALUE;

            for (int ind = i; ind <= j; ind++) {
                int cost = cuts.get(j + 1) - cuts.get(i - 1) + f(i, ind - 1, cuts,dp) + f(ind + 1, j, cuts,dp);
                mini = Math.min(mini, cost);
            }

            return dp[i][j] =mini;
        }
    }


