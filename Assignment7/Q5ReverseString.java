/*
 Q5-Given a string s and an integer k, reverse the first k characters for every 
 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less 
than 2k but greater than or equal to k characters, then reverse the first k characters
and leave the other as original.

Example 1: 

Input: s = "abcdefg", k = 2

Output: "bacdfeg"
 */

public class Q5ReverseString {
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, chars.length - 1);

            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;

        String reversedString = reverseStr(s, k);
        System.out.println(reversedString); // Output: "bacdfeg"
    }
}
