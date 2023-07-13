/*
 * Q1- Given an integer `n`, return *`true` if it is a power of two. Otherwise, return `false`*.

An integer `n` is a power of two, if there exists an integer `x` such that `n == 2x`.

**Example 1:**
Input: n = 1 

Output: true

**Example 2:**
Input: n = 16 

Output: true

**Example 3:**
Input: n = 3 

Output: false
 */

public class Q1CheckGivenNumberPowOf2{
    static boolean isPowerOfTwo(int n) {

        if(n <= 0){
            return false;
        }
        if(n==1){
            return true;
        }
       
        if(n%2 == 0){
            return isPowerOfTwo(n/2);
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        int num = 4;
        System.out.println(isPowerOfTwo(num));
    }
}