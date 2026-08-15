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
    private boolean x=true;
    public boolean isBalanced(TreeNode root) {
        d(root);
        return x;
    }
    private int d(TreeNode root){
        if(root==null){
            return 0;
        }
        int a=d(root.left);
        int b=d(root.right);
        if(Math.abs(a-b)>1){
            x=false;
        }
        return Math.max(a,b)+1;
    }
}
