package com.leetcode_easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(FindMaxProfit(prices));
    }

    public static int FindMaxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                maxProfit = Math.max(maxProfit, price - min);
            }
        }
        return maxProfit;
    }
}
