/*
 Q7- You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

Count and return *the number of maximum integers in the matrix after performing all the operations*

**Example 1:**

**Input:** m = 3, n = 3, ops = [[2,2],[3,3]]

**Output:** 4

**Explanation:** The maximum integer in M is 2, and there are four of it in M. So return 4.
 */

public class Q7MaxCount {
    public static int maxCount(int m, int n, int[][] ops) {
        int minX = m;
        int minY = n;
        
        for (int[] op : ops) {
            minX = Math.min(minX, op[0]);
            minY = Math.min(minY, op[1]);
        }
        
        return minX * minY;
    }
    
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] ops = {{2, 2}, {3, 3}};
        
        int maxIntegers = maxCount(m, n, ops);
        System.out.println("Number of Maximum Integers: " + maxIntegers);
    }
}
