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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Agar dono nodes null hain to same tree hai
        if (p == null && q == null) {
            return true;
        }

        // Agar ek null hai aur dusra nahi, to same nahi hai
        if (p == null || q == null) {
            return false;
        }

        // Agar values alag hain to trees same nahi hain
        if (p.val != q.val) {
            return false;
        }

        // Left subtree aur Right subtree dono same hone chahiye
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}