/*
 Q1-Given an integer array nums of length n and an integer target, find three integers
in nums such that the sum is closest to the target.
Return the sum of the three integers.

You may assume that each input would have exactly one solution.

*Example 1:*
Input: nums = [-1,2,1,-4], target = 1
Output: 2

*Explanation:* 
The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array in ascending order
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize the closest sum to the sum of the first three elements

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Pointer for the element to the right of nums[i]
            int right = nums.length - 1; // Pointer for the last element in the array

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    return sum; // Found the exact target sum, return it
                }

                // Update the closest sum if the current sum is closer to the target
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++; // Increase the sum by moving the left pointer to the right
                } else {
                    right--; // Decrease the sum by moving the right pointer to the left
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int closestSum = threeSumClosest(nums, target);
        System.out.println("Closest sum: " + closestSum);
    }
}
