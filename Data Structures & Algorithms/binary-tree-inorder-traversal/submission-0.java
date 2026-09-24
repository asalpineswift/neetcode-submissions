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
    private static final List<Integer> EMPTY_ARRAY = new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) 
            return EMPTY_ARRAY;

        

        List<Integer> left = inorderTraversal(root.left);
        if(left.isEmpty()) 
            left = new ArrayList<>();        
     
        left.add(root.val);        
        List<Integer> right = inorderTraversal(root.right);
        left.addAll(right);
        return left;
    }
}