/*
 Q6- Given first term (a), common difference (d) and a integer N of the Arithmetic Progression series, 
 the task is to find Nth term of the series.

**Example 1:**

Input : a = 2 d = 1 N = 5
Output : 6
The 5th term of the series is : 6

**Example 2:**

Input : a = 5 d = 2 N = 10
Output : 23
The 10th term of the series is : 23
 */

public class Q6NthTermAP {
    public static int findNthTerm(int a, int d, int N) {
        // Calculate the Nth term of the arithmetic progression
        int nthTerm = a + (N - 1) * d;
        return nthTerm;
    }
    
    public static void main(String[] args) {
        int a1 = 2, d1 = 1, N1 = 5;
        int nthTerm1 = findNthTerm(a1, d1, N1);
        System.out.println("The " + N1 + "th term of the series is: " + nthTerm1); // Output: 6
        
        int a2 = 5, d2 = 2, N2 = 10;
        int nthTerm2 = findNthTerm(a2, d2, N2);
        System.out.println("The " + N2 + "th term of the series is: " + nthTerm2); // Output: 23
    }
}
