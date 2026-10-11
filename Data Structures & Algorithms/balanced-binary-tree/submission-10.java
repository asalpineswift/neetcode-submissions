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
    
    public boolean isBalanced(TreeNode root) {
        int[] count = new int[1];
        try{
            isB(root, count);
        }catch(RuntimeException e){
            System.out.println("falied");
            
            return false;
        }
        return true;
    }
    
    public int isB(TreeNode root, int[] count){
        if(root == null){
            return 0;
        }
        int left = isB(root.left, count);
        int right = isB(root.right, count);
        if(left + right == 1){
            System.out.println("for nodes: left: " + root.left +", right: " + root.right);
            count[0]++;
        }
        if(count[0]  > 1){
            System.out.println("Greater than 1");
            throw new RuntimeException("null");
        }
        return 1;
    }
}
