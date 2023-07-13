/*
 * Q1- Given an integer `n`, return *`true` if it is a power of three. Otherwise, return `false`*.

An integer `n` is a power of three, if there exists an integer `x` such that `n == 3x`.

**Example 1:**

input : 27
output : true
explanation : 3^3

Example 2:

input : -1
output : false

 */

public class Q1PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0 || n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        int num1 = 27;
        System.out.println(num1 + " is a power of three: " + isPowerOfThree(num1)); // Output: true

        int num2 = 45;
        System.out.println(num2 + " is a power of three: " + isPowerOfThree(num2)); // Output: false
    }
}
