package com.anshuman.Dp;

import java.util.List;

public class Triangle {
    private Integer[][] memo;
    public int minimumTotal(List<List<Integer>> triangle){
        int n = triangle.size();
        memo = new Integer[n][n];
        return dfs(0,0,triangle);
    }

    private int dfs(int level, int i, List<List<Integer>> triangle) {
        if (memo[level][i] != null) return memo[level][i];

        int path = triangle.get(level).get(i);
        if (path < triangle.size()-1){
            path += Math.min(dfs(level+1 , i , triangle),dfs(level+1,i+1,triangle));
        }
        return memo[level][i] = path;
    }

}
