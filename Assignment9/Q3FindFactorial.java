/*
 * Q3- Given a positive integer, N. Find the factorial of N. 

**Example 1:**

Input: N = 5 

Output: 120

**Example 2:**

Input: N = 4

Output: 24
 */

public class Q3FindFactorial{
    public static int findFactorial(int number){
        if(number == 0 || number == 1){
            return number;
        }

        if(number < 0){
            System.out.println("Enter a Valid Number");
            System.exit(0);
        }

        return number * findFactorial(number - 1);
    }

    public static void main(String[] args){
        int num = 5;
        System.out.println(findFactorial(num));
    }
}