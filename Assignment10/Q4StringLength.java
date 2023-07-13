/*
 * Q4- Given a string calculate length of the string using recursion.                                                                                                 
 * Example 1   
 * Input : str = "abcd"
Output :4

Input : str = "GEEKSFORGEEKS"
Output :13
 */

public class Q4StringLength {
    public static int calculateLength(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            return 1 + calculateLength(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        System.out.println("Length of \"" + str1 + "\": " + calculateLength(str1)); // Output: 4

        String str2 = "GEEKSFORGEEKS";
        System.out.println("Length of \"" + str2 + "\": " + calculateLength(str2)); // Output: 13
    }
}
