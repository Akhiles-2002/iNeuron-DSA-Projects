/*
 * Q8- Given an array, find a product of all array elements.

**Example 1:**

Input  : arr[] = {1, 2, 3, 4, 5}
Output : 120
**Example 2:**

Input  : arr[] = {1, 6, 3}
Output : 18
 */

public class Q8ProductArrayRecursion {
    public static int getProduct(int[] arr, int index) {
        // Base case: If the index reaches the end of the array, return 1
        if (index == arr.length) {
            return 1;
        }
        
        // Recursive case: Multiply the current element with the product of the rest of the array
        int currentElement = arr[index];
        int productOfRest = getProduct(arr, index + 1);
        
        // Return the product of the current element and the product of the rest of the array
        return currentElement * productOfRest;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int product1 = getProduct(arr1, 0);
        System.out.println("Product of array elements: " + product1); // Output: 120
        
        int[] arr2 = {1, 6, 3};
        int product2 = getProduct(arr2, 0);
        System.out.println("Product of array elements: " + product2); // Output: 18
    }
}



/*
 * public class ArrayProduct {
    public static long getProduct(int[] arr) {
        long product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        long product1 = getProduct(arr1);
        System.out.println("Product of array elements: " + product1); // Output: 120

        int[] arr2 = {1, 6, 3};
        long product2 = getProduct(arr2);
        System.out.println("Product of array elements: " + product2); // Output: 18
    }
}

 */