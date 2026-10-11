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
    private static int count = 0;
    public boolean isBalanced(TreeNode root) {
        try{
            isB(root);
        }catch(RuntimeException e){
            System.out.println("falied");
            count =0;
            return false;
        }
        count =0;
        return true;
    }
    
    public int isB(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = isB(root.left);
        int right = isB(root.right);
        if(left + right == 1){
            System.out.println("for nodes: left: " + root.left +", right: " + root.right);
            count++;
        }
        if(count  > 1){
            System.out.println("Greater than 1");
            throw new RuntimeException("null");
        }
        return 1;
    }
}
