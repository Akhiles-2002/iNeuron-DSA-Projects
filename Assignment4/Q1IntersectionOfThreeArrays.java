/*
Q1-Given three integer arrays arr1, arr2 and arr3 **sorted** in **strictly increasing** order, return a sorted array of **only** the integers that appeared in **all** three arrays.

**Example 1:**

Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]

Output: [1,5]

**Explanation:** Only 1 and 5 appeared in the three arrays

</aside>
 */
import java.util.ArrayList;
import java.util.List;

public class Q1IntersectionOfThreeArrays {
    public static List<Integer> findIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();
        int p1 = 0, p2 = 0, p3 = 0;
        
        while (p1 < arr1.length && p2 < arr2.length && p3 < arr3.length) {
            if (arr1[p1] == arr2[p2] && arr2[p2] == arr3[p3]) {
                result.add(arr1[p1]);
                p1++;
                p2++;
                p3++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else if (arr2[p2] < arr3[p3]) {
                p2++;
            } else {
                p3++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};
        
        List<Integer> intersection = findIntersection(arr1, arr2, arr3);
        System.out.println("Intersection: " + intersection);
    }
}

/*
 import java.util.ArrayList;
import java.util.List;

public class IntersectionOfThreeArrays {
    public static List<Integer> findIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();
        int p1 = 0, p2 = 0, p3 = 0;
        
        while (p1 < arr1.length && p2 < arr2.length && p3 < arr3.length) {
            int num1 = arr1[p1];
            int num2 = arr2[p2];
            int num3 = arr3[p3];
            
            if (num1 == num2 && num2 == num3) {
                result.add(num1);
                p1++;
                p2++;
                p3++;
            } else if (num1 <= num2 && num1 <= num3) {
                p1++;
            } else if (num2 <= num1 && num2 <= num3) {
                p2++;
            } else {
                p3++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};
        
        List<Integer> intersection = findIntersection(arr1, arr2, arr3);
        System.out.println("Intersection: " + intersection);
    }
}

 */