/*
Q5- Given an array of integers **arr**, the task is to find maximum element of that array using recursion.

**Example 1:**

Input: arr = {1, 4, 3, -5, -4, 8, 6};
Output: 8

**Example 2:**

Input: arr = {1, 4, 45, 6, 10, -8};
Output: 45
*/

public class Q5MaximumElementRecursion {
    public static int findMaximum(int[] arr, int index) {
        // Base case: If the index reaches the end of the array, return the last element
        if (index == arr.length - 1) {
            return arr[index];
        }
        
        // Recursive case: Compare the current element with the maximum element from the rest of the array
        int currentElement = arr[index];
        int maxFromRest = findMaximum(arr, index + 1);
        
        // Return the maximum between the current element and the maximum from the rest of the array
        return Math.max(currentElement, maxFromRest);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int max = findMaximum(arr, 0);
        System.out.println("Maximum element: " + max); // Output: 8
        
        int[] arr2 = {1, 4, 45, 6, 10, -8};
        int max2 = findMaximum(arr2, 0);
        System.out.println("Maximum element: " + max2); // Output: 45
    }
}
