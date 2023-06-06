/*
 Q8-You are given an integer array nums and an integer k.

In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.

The score of nums is the difference between the maximum and minimum elements in nums.

Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

*Example 1:*
Input: nums = [1], k = 0
Output: 0

*Explanation:* The score is max(nums) - min(nums) = 1 - 1 = 0.

 */
import java.util.Arrays;

public class MinimumScore {
    public static int minimumScore(int[] nums, int k) {
        int minNum = Arrays.stream(nums).min().getAsInt();
        int maxNum = Arrays.stream(nums).max().getAsInt();

        if (maxNum - minNum <= 2 * k) {
            return 0;
        }

        int target = (minNum + maxNum) / 2;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target - k) {
                nums[i] = target - k;
            } else if (nums[i] > target + k) {
                nums[i] = target + k;
            }
        }

        minNum = Arrays.stream(nums).min().getAsInt();
        maxNum = Arrays.stream(nums).max().getAsInt();

        return maxNum - minNum;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int minimumScore = minimumScore(nums, k);
        System.out.println("Minimum score: " + minimumScore);
    }
}
