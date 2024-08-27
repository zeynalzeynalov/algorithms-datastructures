package com.zeynal.app;

import java.util.Stack;

class BalancedBracesSolution {

    private final static String OPENING_BRACE = "[{(";
    private final static String CLOSING_BRACE = "]})";

    public static boolean isBalanced(String input) {

        Stack<Character> stack = new Stack<Character>();
        boolean isBalanced = true;

        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);

            if (OPENING_BRACE.contains(c.toString()))
                stack.push(c);
            else if (stack.empty()) {
                isBalanced = false;
                break;
            } else if (stack.peek().equals(OPENING_BRACE.charAt(CLOSING_BRACE.lastIndexOf(c))))
                stack.pop();
            else {
                isBalanced = false;
                break;
            }
        }

        return (stack.empty() && isBalanced);
    }
}
