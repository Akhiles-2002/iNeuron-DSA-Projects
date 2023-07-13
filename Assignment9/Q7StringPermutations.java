/**
Q7- Given a string S, the task is to write a program to print all permutations of a given string.

Example 1:

Input:

S = “ABC”

Output:

“ABC”, “ACB”, “BAC”, “BCA”, “CBA”, “CAB”

Example 2:

Input:

S = “XY”

Output:

“XY”, “YX”
  
 **/


public class Q7StringPermutations {
    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i); // backtrack to restore the original string
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String S1 = "ABC";
        System.out.println("Permutations of " + S1 + ":");
        permute(S1, 0, S1.length() - 1);

        String S2 = "XY";
        System.out.println("Permutations of " + S2 + ":");
        permute(S2, 0, S2.length() - 1);
    }
}
