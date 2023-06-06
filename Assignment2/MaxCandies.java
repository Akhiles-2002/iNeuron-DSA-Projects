/*
Q2-Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor. 
The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice. 
Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.

Example 1:
Input: candyType = [1,1,2,2,3,3]
Output: 3

Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type
 */
import java.util.HashSet;

public class MaxCandies {
    public static int maxCandies(int[] candyType) {
        int n = candyType.length;
        int maxCandies = n / 2;

        HashSet<Integer> uniqueCandies = new HashSet<>();

        // Count the number of unique candies
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        // Return the minimum of unique candies and maxCandies
        return Math.min(uniqueCandies.size(), maxCandies);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxCount = maxCandies(candyType);
        System.out.println("Maximum number of different candies Alice can eat: " + maxCount);
    }
}
