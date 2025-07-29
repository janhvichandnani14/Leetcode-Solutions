import java.util.*;

class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                leftStack.push(i);
            } else if (c == '*') {
                starStack.push(i);
            } else if (c == ')') {
                if (!leftStack.isEmpty()) {
                    leftStack.pop(); // match with '('
                } else if (!starStack.isEmpty()) {
                    starStack.pop(); // match with '*'
                } else {
                    return false; // unmatched ')'
                }
            }
        }

        // Try to match remaining '(' with '*' that appear after it
        while (!leftStack.isEmpty() && !starStack.isEmpty()) {
            int leftIndex = leftStack.pop();
            int starIndex = starStack.pop();
            if (starIndex < leftIndex) {
                return false; // star can't match '(' before it
            }
        }

        return leftStack.isEmpty();
    }
}
