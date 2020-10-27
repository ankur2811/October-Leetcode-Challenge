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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        
        if(root.left==null && root.right==null)
            return 1;
        
        int maxh=(int)1e8;
        if(root.left!=null)
            maxh=Math.min(maxh,minDepth(root.left));
        if(root.right!=null)
            maxh=Math.min(maxh,minDepth(root.right));
        
        return maxh+1;
    }
}