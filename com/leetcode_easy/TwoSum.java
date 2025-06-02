package com.leetcode_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 11;

        try {
            int[] result = twoSum(array, target);
            System.out.println(Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (myMap.containsKey(complement)) {
                return new int[] {myMap.get(complement), i};
            } else {
                myMap.put(arr[i], i);
            }
        }

        throw new IllegalArgumentException("No match found.");
    }
}
