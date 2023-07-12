/*
Q6- Given two strings s and p, return *an array of all the start indices of* p*'s anagrams in* s. 
You may return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.

**Example 1:**

**Input:** s = "cbaebabacd", p = "abc"

**Output:** [0,6]

**Explanation:**

The substring with start index = 0 is "cba", which is an anagram of "abc".

The substring with start index = 6 is "bac", which is an anagram of "abc".
*/

import java.util.*;

public class Q6AnagramIndices {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        // Create frequency maps for characters in p and the sliding window
        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        // Initialize the sliding window
        int windowSize = p.length();
        for (int i = 0; i < windowSize - 1; i++) {
            windowFreq[s.charAt(i) - 'a']++;
        }

        // Slide the window through s
        for (int start = 0, end = windowSize - 1; end < s.length(); start++, end++) {
            // Update the frequency of the new character in the window
            windowFreq[s.charAt(end) - 'a']++;

            // Check if the current window is an anagram of p
            if (Arrays.equals(pFreq, windowFreq)) {
                result.add(start);
            }

            // Remove the frequency of the character going out of the window
            windowFreq[s.charAt(start) - 'a']--;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> indices = findAnagrams(s, p);
        System.out.println("Indices of anagrams: " + indices);
    }
}
