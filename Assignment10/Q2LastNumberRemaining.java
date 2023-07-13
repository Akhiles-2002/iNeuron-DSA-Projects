/*
 * Q2- 
You have a list `arr` of all integers in the range `[1, n]` sorted in a strictly increasing order. 
Apply the following algorithm on `arr`:

- Starting from left to right, remove the first number and every other number afterward until you 
reach the end of the list.
- Repeat the previous step again, but this time from right to left, remove the rightmost number 
and every other number from the remaining numbers.
- Keep repeating the steps again, alternating left to right and right to left, until a single number remains.

Given the integer `n`, return *the last number that remains in* `arr`.  
Example 1:

Input: n = 9
Output: 6
Explanation:
arr = [1, 2,3, 4,5, 6,7, 8,9]
arr = [2,4, 6,8]
arr = [2, 6]
arr = [6]       
                                                                                                                                                                                                     
Example 2: 

Input: n = 1
Output: 1 using recursion
 */

public class Q2LastNumberRemaining {
    public static int lastRemaining(int n) {
        return lastRemainingHelper(n, true);
    }

    public static int lastRemainingHelper(int n, boolean leftToRight) {
        if (n == 1) {
            return 1;
        }

        if (leftToRight) {
            return 2 * lastRemainingHelper(n / 2, false);
        } else {
            if (n % 2 == 0) {
                return 2 * lastRemainingHelper(n / 2, true) - 1;
            } else {
                return 2 * lastRemainingHelper(n / 2, true);
            }
        }
    }

    public static void main(String[] args) {
        int n1 = 9;
        System.out.println("Last number remaining for n = " + n1 + ": " + lastRemaining(n1)); // Output: 6

        int n2 = 1;
        System.out.println("Last number remaining for n = " + n2 + ": " + lastRemaining(n2)); // Output: 1
    }
}
