/*
 * Q4- You need to construct a binary tree from a string consisting of parenthesis and integers.

The whole input represents a binary tree. It contains an integer followed by zero, one or two 
pairs of parenthesis. The integer represents the root's value and a pair of parenthesis contains 
a child binary tree with the same structure.
You always start to construct the **left** child node of the parent first if it exists.                    
**Input:** s = "4(2(3)(1))(6(5))"

**Output:** [4,2,6,3,1,5]
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Q4ConstructBinaryTreeFromString {
    private static int index = 0;

    public static TreeNode str2tree(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }

        int val = getNumber(s);
        TreeNode root = new TreeNode(val);

        if (index < s.length()) {
            if (s.charAt(index) == '(') {
                index++; // Skip the opening parenthesis
                root.left = str2tree(s); // Recursively construct the left subtree
            }
            if (index < s.length() && s.charAt(index) == ')') {
                index++; // Skip the closing parenthesis
            }
            if (index < s.length() && s.charAt(index) == '(') {
                index++; // Skip the opening parenthesis
                root.right = str2tree(s); // Recursively construct the right subtree
            }
            if (index < s.length() && s.charAt(index) == ')') {
                index++; // Skip the closing parenthesis
            }
        }

        return root;
    }

    private static int getNumber(String s) {
        StringBuilder sb = new StringBuilder();
        while (index < s.length() && (Character.isDigit(s.charAt(index)) || s.charAt(index) == '-')) {
            sb.append(s.charAt(index));
            index++;
        }
        return Integer.parseInt(sb.toString());
    }

    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        String s = "4(2(3)(1))(6(5))";
        TreeNode root = str2tree(s);

        System.out.print("Inorder Traversal: ");
        inorderTraversal(root);
    }
}
