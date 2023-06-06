/*
 Q4-You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

*Example 1:*
Input: digits = [1,2,3]
Output: [1,2,4]

*Explanation:* The array represents the integer 123.

Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
 */
import java.util.Arrays;

public class AddOneInArrayElement {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from the least significant digit to the most significant digit
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by one
            digits[i]++;

            // Check if there is a carry
            if (digits[i] < 10) {
                // No carry, return the updated digits array
                return digits;
            }

            // Carry occurred, set the current digit to 0 and continue to the next digit
            digits[i] = 0;
        }

        // If we reach here, it means there was a carry from the most significant digit
        // Create a new array with an extra digit for the carry
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}
