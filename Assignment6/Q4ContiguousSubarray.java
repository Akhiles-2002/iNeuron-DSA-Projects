/*
 Q4-Given a binary array nums, return *the maximum length of a contiguous subarray with an equal 
 number of* 0 *and* 1.

**Example 1:**

**Input:** nums = [0,1]

**Output:** 2

**Explanation:**

[0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
 */

import java.util.HashMap;
import java.util.Map;

public class Q4ContiguousSubarray {
    public static int findMaxLength(int[] nums) {
        int maxLen = 0;
        int sum = 0;
        Map<Integer, Integer> sumToIndex = new HashMap<>();
        sumToIndex.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }
            
            if (sumToIndex.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - sumToIndex.get(sum));
            } else {
                sumToIndex.put(sum, i);
            }
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};
        int maxLen = findMaxLength(nums);
        System.out.println(maxLen);
    }
}
