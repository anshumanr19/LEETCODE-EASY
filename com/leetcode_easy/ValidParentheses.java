package com.leetcode_easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "()(()){{{}}}[(()){[]}]";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') myStack.push(ch);
            else if (!myStack.isEmpty() && ch == ')' && myStack.peek() == '(') myStack.pop();
            else if (!myStack.isEmpty() && ch == '}' && myStack.peek() == '{') myStack.pop();
            else if (!myStack.isEmpty() && ch == ']' && myStack.peek() == '[') myStack.pop();
            else return false;
        }

        return myStack.isEmpty();
    }
}
