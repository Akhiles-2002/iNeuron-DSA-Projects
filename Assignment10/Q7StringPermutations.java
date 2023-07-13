/*
 * Q7-  Given a string **str**, the task is to print all the permutations of **str**. A 
 * **permutation** is an arrangement of all or part of a set of objects, with regard to the 
 * order of the arrangement. For instance, the words ‘bat’ and ‘tab’ represents two distinct 
 * permutation (or arrangements) of a similar three letter word.

**Examples:**                                                                                                                                                                                            > Input: str = “cd”

**Output:** cd dc

**Input:** str = “abb”

**Output:** abb abb bab bba bab bba

 */

public class Q7StringPermutations {
    public static void printPermutations(String str) {
        printPermutationsHelper(str, 0, str.length() - 1);
    }

    public static void printPermutationsHelper(String str, int left, int right) {
        if (left == right) {
            System.out.print(str + " ");
            return;
        }

        for (int i = left; i <= right; i++) {
            str = swap(str, left, i);
            printPermutationsHelper(str, left + 1, right);
            str = swap(str, left, i); // backtrack to restore the original string
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
        String str1 = "cd";
        System.out.println("Permutations of \"" + str1 + "\":");
        printPermutations(str1);
        System.out.println(); // Print a newline for clarity

        String str2 = "abb";
        System.out.println("Permutations of \"" + str2 + "\":");
        printPermutations(str2);
    }
}
