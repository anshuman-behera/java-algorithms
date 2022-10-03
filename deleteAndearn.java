package com.anshuman.Dp;

import java.security.PrivateKey;
import java.util.HashMap;

public class deleteAndearn {
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        int[] values = new int[n];
        for (int num:nums)

            values[num] += num;
        int take = 0 ;
        int skip = 0 ;
        for (int i = 0; i < n; i++) {
            int takei = skip + values[i];
            int skipi = Math.max(skip,take);
            take = takei;
            skip = skipi;

        }
        return Math.max(take,skip);
    }

}

    class Solution {
        private HashMap<Integer, Integer> points = new HashMap<>();
        private HashMap<Integer, Integer> cache = new HashMap<>();

        private int maxPoints(int num) {
            // Check for base cases
            if (num == 0) {
                return 0;
            }

            if (num == 1) {
                return points.getOrDefault(1, 0);
            }

            if (cache.containsKey(num)) {
                return cache.get(num);
            }

            // Apply recurrence relation
            int gain = points.getOrDefault(num, 0);
            cache.put(num, Math.max(maxPoints(num - 1), maxPoints(num - 2) + gain));
            return cache.get(num);
        }

        public int deleteAndEarn(int[] nums) {
            int maxNumber = 0;

            // Precompute how many points we gain from taking an element
            for (int num : nums) {
                points.put(num, points.getOrDefault(num, 0) + num);
                maxNumber = Math.max(maxNumber, num);
            }

            return maxPoints(maxNumber);
        }
    }

