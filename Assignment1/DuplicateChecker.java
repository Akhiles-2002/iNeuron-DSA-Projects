/*
Q6-Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

*Example 1:*
Input: nums = [1,2,3,1]

Output: true
write code in java and give proper class name.
 */
import java.util.HashSet;

public class DuplicateChecker {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean hasDuplicates = containsDuplicate(nums);
        System.out.println("Has duplicates: " + hasDuplicates);
    }
}
