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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root ==null || subRoot == null) return false;

        TreeNode notedNode = findNode(root, subRoot.val);

        if(notedNode == null){
            return false;
        }

        return compareNode(notedNode, subRoot);

    }

    public TreeNode findNode(TreeNode root, int val){
        if(root ==null) return null;

        if(root.val == val) return root;

        TreeNode left = findNode(root.left, val);
        if(left!=null) return left;
        
        TreeNode right = findNode(root.right, val);
        if(right!=null) return right;
        
        return null;
    }

    public boolean compareNode(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null) return true;

        if((root != null && subRoot == null) || (root ==null && subRoot != null)) return false;

        if(root.val != subRoot.val) return false;

        return compareNode(root.left, subRoot.left) && compareNode(root.right, subRoot.right);
    }


}
