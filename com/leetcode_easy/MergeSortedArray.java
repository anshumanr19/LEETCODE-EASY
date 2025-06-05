package com.leetcode_easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = nums1.length - 1;

        while (p3 >= 0) {
            int element1 = (p1 >= 0) ? nums1[p1] : Integer.MIN_VALUE;
            int element2 = (p2 >= 0) ? nums2[p2] : Integer.MIN_VALUE;

            if (element1 > element2) {
                nums1[p3] = element1;
                p3--;
                p1--;
            } else {
                nums1[p3] = element2;
                p3--;
                p2--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
