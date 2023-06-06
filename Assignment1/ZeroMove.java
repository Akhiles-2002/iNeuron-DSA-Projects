/*
 Q7-Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

*Example 1:*
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */
import java.util.Arrays;

public class ZeroMove {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int writeIndex = 0;

        // Iterate through the array and move all nonzero elements to the front
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }

        // Fill the remaining elements with zeros
        while (writeIndex < n) {
            nums[writeIndex] = 0;
            writeIndex++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
