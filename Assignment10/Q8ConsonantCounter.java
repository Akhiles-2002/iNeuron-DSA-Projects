/*
 * Q8- Given a string, count total number of consonants in it. A consonant is an English alphabet 
 * character that is not vowel (a, e, i, o and u). Examples of constants are b, c, d, f, and g.

**Examples :**                                                                                                                                                                                         Input : abc de
Output : 3
There are three consonants b, c and d.

Input : geeksforgeeks portal
Output : 12 
 */

public class Q8ConsonantCounter {
    public static int countConsonants(String str) {
        return countConsonantsHelper(str.toLowerCase(), 0);
    }

    public static int countConsonantsHelper(String str, int index) {
        if (index == str.length()) {
            return 0;
        }

        char ch = str.charAt(index);
        if (isConsonant(ch)) {
            return 1 + countConsonantsHelper(str, index + 1);
        } else {
            return countConsonantsHelper(str, index + 1);
        }
    }

    public static boolean isConsonant(char ch) {
        return !isVowel(ch) && Character.isLetter(ch);
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String str1 = "abc de";
        System.out.println("Number of consonants in \"" + str1 + "\": " + countConsonants(str1)); // Output: 3

        String str2 = "geeksforgeeks portal";
        System.out.println("Number of consonants in \"" + str2 + "\": " + countConsonants(str2)); // Output: 12
    }
}
