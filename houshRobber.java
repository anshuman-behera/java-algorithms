package com.anshuman.Dp;

import java.util.ArrayList;
import java.util.Arrays;

public class houshRobber {
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int n=arr.size();
        System.out.println(houseRObber(n,arr));


    }
    static long houseRObber(int n , ArrayList<Integer> arr){
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            //skeep the first element
            if (i != 0) arr1.add(arr.get(i));
            //skeep the last element
            if (i != n-1) arr2.add(arr.get(i));
        }
        long ans1 = solve(arr1);
        long ans2 = solve(arr2);
        return Math.max(ans1,ans2);
    }
    static int solve(ArrayList<Integer> arr){
        int n = arr.size();
        int prev =arr.get(0);
        int prev2 = 0;
        for (int i =1; i <n; i++) {
            int take = arr.get(i);
            if (i>1) take += prev2;
            int nontake = 0+ prev;

            int curi = Math.max(take,nontake);
            prev2 = prev;
            prev = curi;

        }
        return prev;
    }
}
