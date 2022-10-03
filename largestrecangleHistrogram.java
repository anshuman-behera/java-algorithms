package com.anshuman.Dp;

import java.util.Stack;

public class largestrecangleHistrogram {
    public static void main(String[] args) {

    }
    public int largestRectangleArea1(int[] heights) {
        int n = heights.length;
        int maxarea = 0 ;
        for (int i = 0; i < n; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < n ; j++) {
                minHeight = Math.min(minHeight,heights[j]);
                maxarea = Math.max(maxarea,minHeight*(j-i+1));

            }

        }
        return maxarea;
    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxA = 0 ;
        int n = heights.length;
        for (int i = 0; i <= n ; i++) {
            while (!st.empty() && (i == n || heights[st.peek()] >= heights[i])){
                int height = heights[st.peek()];
                st.pop();
                int width;
                if (st.empty()){
                    width = i ;

                }
                else width = i - st.peek() - 1 ;
                maxA = Math.max(maxA,width * height);
            }
            st.push(i);

        }
        return maxA;
    }

}
