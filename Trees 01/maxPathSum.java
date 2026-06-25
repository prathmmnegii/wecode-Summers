class Solution {

    int max= Integer.MIN_VALUE;
    int helper(Node root){
        if(root==null){
            return 0;
        }

        int leftsum= Math.max(0, helper(root.left));
        int rightsum= Math.max(0, helper(root.right));

        max= Math.max(max, root.val+ leftsum+ rightsum);
        return root.val+ Math.max(leftsum, rightsum);
    }

    public int maxPathSum(Node root) {
        helper(root);
        return max;

        
    }
}