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
    
    TreeNode A=null;
    TreeNode B=null;
        TreeNode prev=null;
    public void recoverTree(TreeNode root) {
     
       recoverTree_(root);
        if(A!=null)
       {
           int temp=A.val;
           A.val=B.val;
           B.val=temp;
       }
    }
    
    public boolean recoverTree_(TreeNode root)
    {
           if(root==null)
               return false;
        if(recoverTree_(root.left))
        return true;
       if(prev==null)
           prev=root;
        
        else
        {
            if(root.val<prev.val)
            {
                if(A==null){
                A=prev;
                B=root;
                prev=root;}
                else
                {
                    B=root;
                    return true;
                }
            }
        }
        
        prev=root;
        
        
       if(recoverTree_(root.right))
           return true;
        
        return false;
    }
        
}