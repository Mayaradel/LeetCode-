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

    public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> arr = new ArrayList<>();
        postorderTraversalHelper(root, arr);
        return arr;
    }

    public void postorderTraversalHelper(TreeNode node, List arr) {
        if (node != null) {
            postorderTraversalHelper(node.left,arr);
            postorderTraversalHelper(node.right,arr);
            arr.add(node.val);
        }
    }
}
