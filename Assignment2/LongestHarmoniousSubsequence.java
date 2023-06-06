/*
Q3-We define a harmonious array as an array where the difference between its maximum value
and its minimum value is exactly 1.

Given an integer array nums, return the length of its longest harmonious subsequence
among all its possible subsequences.

A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

*Example 1:*
Input: nums = [1,3,2,2,5,2,3,7]
Output: 5

*Explanation:* The longest harmonious subsequence is [3,2,2,2,3].
 */
import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxLength = 0;

        // Count the frequency of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the length of the longest harmonious subsequence
        for (int num : countMap.keySet()) {
            if (countMap.containsKey(num + 1)) {
                int length = countMap.get(num) + countMap.get(num + 1);
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int longestLength = findLHS(nums);
        System.out.println("Length of the longest harmonious subsequence: " + longestLength);
    }
}
