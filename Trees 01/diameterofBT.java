class Solution {
        int diameter=0;
    

    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lefth= height(root.left);
        int righth= height(root.right);

        diameter= Math.max(diameter, lefth+righth);
        return 1+ Math.max(lefth, righth);

        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
        
    }
}