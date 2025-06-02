package com.leetcode_easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;

        if (isPalindrome(number)) System.out.println("True");
        else System.out.println("False");
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) return false;
        String n = num + "";
        return checkPalindrome(n);
    }

    public static boolean checkPalindrome(String num) {
        int left = 0;
        int right = num.length() - 1;

        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
