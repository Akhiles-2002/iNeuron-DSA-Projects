/*
 * Q5-We are given a string S, we need to find count of all contiguous substrings starting and 
 * ending with same character.  

Input  : S = "abcab"
Output : 7
There are 15 substrings of "abcab"
a, ab, abc, abca, abcab, b, bc, bca
bcab, c, ca, cab, a, ab, b
Out of the above substrings, there
are 7 substrings : a, abca, b, bcab,
c, a and b.

Input  : S = "aba"
Output : 4
The substrings are a, b, a and aba

 */

public class Q5ContiguousSubstrings {
    public static int countSubstrings(String str) {
        return countSubstringsHelper(str, 0, str.length() - 1);
    }

    public static int countSubstringsHelper(String str, int start, int end) {
        // Base case: if start and end indices become equal or cross each other
        if (start >= end) {
            return 0;
        }

        int count = countSubstringsHelper(str, start + 1, end) +
                countSubstringsHelper(str, start, end - 1) -
                countSubstringsHelper(str, start + 1, end - 1);

        if (str.charAt(start) == str.charAt(end)) {
            count += 1 + countSubstringsHelper(str, start + 1, end - 1);
        }

        return count;
    }

    public static void main(String[] args) {
        String str1 = "abcab";
        System.out.println("Count of contiguous substrings in \"" + str1 + "\": " + countSubstrings(str1)); // Output: 7

        String str2 = "aba";
        System.out.println("Count of contiguous substrings in \"" + str2 + "\": " + countSubstrings(str2)); // Output: 4
    }
}
