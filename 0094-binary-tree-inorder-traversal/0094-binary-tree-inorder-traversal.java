/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inorderTraversalHelper(root, arr);
        return arr;
    }

    private void inorderTraversalHelper(TreeNode node, List<Integer> arr) {
        if (node != null) {
            inorderTraversalHelper(node.left, arr);
            arr.add(node.val);
            inorderTraversalHelper(node.right, arr);
        }
    }
}
