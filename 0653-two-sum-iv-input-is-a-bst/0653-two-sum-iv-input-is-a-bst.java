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
    public boolean findTarget(TreeNode root, int k) {

        return solve(root,root,k);  
    }
    boolean solve(TreeNode root , TreeNode curr , int k){

        if(curr==null) return false;

        int diff = k - curr.val;

        if(search(root,curr,diff)) return true;

        return solve(root , curr.left,k) || solve(root,curr.right,k);

    }

    boolean search(TreeNode root, TreeNode curr, int diff){
        if(root == null) return false;

        if(root.val==diff && curr!=root){
            return true;
        }
        else if(root.val < diff){
            return search(root.right,curr,diff);
        }
        else{
            return search(root.left,curr,diff);
        }

    
    }


}