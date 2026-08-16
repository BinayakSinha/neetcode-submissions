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
        boolean x=false;
        if(root==null){
            return false;
        }
        if(subRoot==null){
            return true;
        }
        if(root.val==subRoot.val){
            x=isEqual(root,subRoot);
        }
        return x || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    static boolean isEqual(TreeNode a,TreeNode b){
        if(a==null && b==null){
            return true;
        }
        if(a==null || b==null){
            return false;
        }
        if(a.val!=b.val){
            return false;
        }
        return isEqual(a.left,b.left) && isEqual(a.right,b.right);
    }
}
