/*
Q3-Given an array of integers arr, return *true if and only if it is a valid mountain array*.

Recall that arr is a mountain array if and only if:

- arr.length >= 3
- There exists some i with 0 < i < arr.length - 1 such that:
    - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]                                                                                                  
 
    **Example 1:**

**Input:** arr = [2,1]

**Output:**
false
 */

public class Q3ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        
        if (n < 3) {
            return false;
        }
        
        int left = 0;
        int right = n - 1;
        
        while (left + 1 < n && arr[left] < arr[left + 1]) {
            left++;
        }
        
        while (right > 0 && arr[right - 1] > arr[right]) {
            right--;
        }
        
        return left > 0 && right < n - 1 && left == right;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1};
        boolean result = validMountainArray(arr);
        System.out.println(result);
    }
}
