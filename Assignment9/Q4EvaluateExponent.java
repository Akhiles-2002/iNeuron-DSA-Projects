/*
Q4- Given a number N and a power P, the task is to find the exponent of this number raised to the 
given power, i.e. N^P.

**Example 1 :** 

Input: N = 5, P = 2

Output: 25

**Example 2 :**
Input: N = 2, P = 5

Output: 32
*/

public class Q4EvaluateExponent{

    public static long findExponent(int n, int e){
        if(e == 0){
            return 1;
        }

        return n * findExponent(n, (e - 1));
    }

    public static void main(String[] args){
        int n = 2, e = 5;
        System.out.println(findExponent(n, e));
        n = 5; 
        e = 3;
        System.out.println(findExponent(n, e));
    }
}