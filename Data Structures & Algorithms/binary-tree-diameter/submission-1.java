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
    private int val=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        d(root);
        return val;
    }
    private int d(TreeNode root){
        if(root==null){
            return 0;
        }
        int a=d(root.left);
        int b=d(root.right);
        val=Math.max(val,a+b);
        return Math.max(a,b)+1;
    }
}
