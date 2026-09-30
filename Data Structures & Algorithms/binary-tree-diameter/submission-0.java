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

    public int diameterOfBinaryTree(TreeNode root) {
        
        // check left height
        // check right height
        // check max of leftor right
        // it can 
        Diameter d = new Diameter();
        return num.max;
    }

    public int inorder(TreeNode node, Diameter d){
        if ( node== null) return -1;

        int left = inorder(node.left , d);
        int right= inorder(node.right, d);
        Math.max(left,)


    }

    public static class Diameter{
       int depth;
       int left;
       int rightMax;
    }

}
