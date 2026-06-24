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
    public TreeNode searchBST(TreeNode root, int val) {

        while (root!= null){
            if(root.val==val){
                return root;  // returns the entire subtree that contains the node containing the value
            }

            if (val<root.val){
                root= root.left;  //if val is lesser than traverse in left subtree

            }
            else 
            {
                root= root.right;  //if val is greater thean traverse in right subtree
            }
        }

        return null;   // if node containing the val not found then return null
        
    }
}