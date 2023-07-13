/*
 * Q2- Given a number n, find the sum of the first natural numbers.

**Example 1:**

Input: n = 3 

Output: 6

**Example 2:**

Input  : 5 

Output : 15
 */

public class Q2FindSumOfNaturalNumbers{
    public static int findSumOfNatNum(int number){
        if(number == 1){
            return 1;
        }

        return number + findSumOfNatNum(number - 1);
    }

    public static void main(String[] args){
        int num = 5;
        System.out.println(findSumOfNatNum(num));
    }
}