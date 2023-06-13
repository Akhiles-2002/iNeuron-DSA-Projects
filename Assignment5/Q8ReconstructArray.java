/*
 Q8-An integer array original is transformed into a **doubled** array changed by appending **twice the value**
 of every element in original, and then randomly **shuffling** the resulting array.

Given an array changed, return original *if* changed *is a **doubled** array. If* changed *is not a 
**doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.

**Example 1:**

**Input:** changed = [1,3,4,2,6,8]

**Output:** [1,3,4]

**Explanation:** One possible original array could be [1,3,4]:

- Twice the value of 1 is 1 * 2 = 2.
- Twice the value of 3 is 3 * 2 = 6.
- Twice the value of 4 is 4 * 2 = 8.

Other original arrays could be [4,3,1] or [3,1,4].
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q8ReconstructArray {
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0]; // Invalid input, the changed array length must be even
        }

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : changed) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> originalList = new ArrayList<>();

        for (int num : changed) {
            if (freqMap.getOrDefault(num, 0) == 0) {
                continue; // Skip elements that have already been used
            }

            int twiceNum = num * 2;

            if (freqMap.getOrDefault(twiceNum, 0) == 0) {
                return new int[0]; // Invalid input, unable to reconstruct the original array
            }

            originalList.add(num);
            freqMap.put(num, freqMap.get(num) - 1);
            freqMap.put(twiceNum, freqMap.get(twiceNum) - 1);
        }

        int[] original = new int[originalList.size()];

        for (int i = 0; i < originalList.size(); i++) {
            original[i] = originalList.get(i);
        }

        return original;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);

        for (int num : original) {
            System.out.print(num + " ");
        }
    }
}
