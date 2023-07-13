/*
 * Q3- Given a set represented as a string, write a recursive code to print all subsets of it. The subsets 
 * can be printed in any order.

**Example 1:**

Input :  set = “abc”

Output : { “”, “a”, “b”, “c”, “ab”, “ac”, “bc”, “abc”}

**Example 2:**

Input : set = “abcd”

Output : { “”, “a” ,”ab” ,”abc” ,”abcd”, “abd” ,”ac” ,”acd”, “ad” ,”b”, “bc” ,”bcd” ,”bd” ,”c” ,”cd”
     ,”d” } using recursion.
 */

public class Q3SubsetPrinter {
    public static void printSubsets(String set) {
        printSubsetsHelper(set, "", 0);
    }

    public static void printSubsetsHelper(String set, String currentSubset, int index) {
        if (index == set.length()) {
            System.out.print("\"" + currentSubset + "\" ");
            return;
        }

        // Include the current character
        printSubsetsHelper(set, currentSubset + set.charAt(index), index + 1);

        // Exclude the current character
        printSubsetsHelper(set, currentSubset, index + 1);
    }

    public static void main(String[] args) {
        String set1 = "abc";
        System.out.println("Subsets of \"" + set1 + "\":");
        printSubsets(set1);
        System.out.println(); // Print a newline for clarity

        String set2 = "abcd";
        System.out.println("Subsets of \"" + set2 + "\":");
        printSubsets(set2);
    }
}
