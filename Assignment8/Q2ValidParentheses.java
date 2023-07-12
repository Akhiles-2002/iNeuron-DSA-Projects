/*
 * Q2 - Given a string s containing only three types of characters: '(', ')' and '*', return true *if* s *is **valid***.

The following rules define a **valid** string:

- Any left parenthesis '(' must have a corresponding right parenthesis ')'.
- Any right parenthesis ')' must have a corresponding left parenthesis '('.
- Left parenthesis '(' must go before the corresponding right parenthesis ')'.
- '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

**Example 1:**

**Input:** s = "()"

**Output:**

true
 */
import java.util.Stack;

public class Q2ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '*') {
                stack.push(c);
            } else if (!stack.isEmpty() && (c == ')' || c == '*')) {
                stack.pop();
            } else {
                return false;
            }
        }

        int openCount = 0;
        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (c == '(') {
                openCount++;
            } else if (c == '*') {
                if (openCount > 0) {
                    openCount--;
                }
            }
        }

        return openCount == 0;
    }

    public static void main(String[] args) {
        String s = "()";
        boolean isValid = isValid(s);
        System.out.println("Is the string valid? " + isValid);
    }
}
