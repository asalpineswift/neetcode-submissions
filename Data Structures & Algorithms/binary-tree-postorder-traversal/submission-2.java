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
    private static final List<Integer> EMPTY_ARRAY = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root == null) return EMPTY_ARRAY;
        
        List<Integer> arr = postorderTraversal(root.left);
        if(arr.isEmpty()) arr = new ArrayList<>();
        arr.addAll(postorderTraversal(root.right));
        arr.add(root.val);
        return arr;
    }
}