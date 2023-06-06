/*
Q5-Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

*Example 1:*
Input: nums = [1,2,3]
Output: 6

 */
import java.util.Arrays;

public class MaximumProduct {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        // Case 1: Product of the three largest positive numbers
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Case 2: Product of the two smallest negative numbers and the largest positive number
        int product2 = nums[0] * nums[1] * nums[n - 1];

        // Return the maximum of the two cases
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int maxProduct = maximumProduct(nums);
        System.out.println("Maximum product: " + maxProduct);
    }
}
