/*
 Q1-A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented 
 as a string s of length n where:

- s[i] == 'I' if perm[i] < perm[i + 1], and
- s[i] == 'D' if perm[i] > perm[i + 1].

Given a string s, reconstruct the permutation perm and return it. If there are multiple valid 
permutations perm, return **any of them**.

**Example 1:**

**Input:** s = "IDID"

**Output:**

[0,4,1,3,2].
 */

import java.util.ArrayList;
import java.util.List;

public class Q1ReconstructPermutation {
    public static int[] findPermutation(String s) {
        int n = s.length();
        int low = 0;
        int high = n;
        List<Integer> perm = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (c == 'I') {
                perm.add(low);
                low++;
            } else if (c == 'D') {
                perm.add(high);
                high--;
            }
        }

        perm.add(low); // Append the remaining value of low

        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = perm.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] perm = findPermutation(s);

        for (int num : perm) {
            System.out.print(num + " ");
        }
    }
}
