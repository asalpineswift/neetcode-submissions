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
    private List<Integer> arr;

    public void inorder(TreeNode node){
        if(node == null){
            return;
        }
        inorder(node.left);
        inorder(node.right);
        arr.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        
        arr = new ArrayList<>();
        inorder(root);
        return arr;
    }
}