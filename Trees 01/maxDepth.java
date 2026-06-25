class Solution{

    int maxDepth(Node root){
        if(root==null){
            return 0;
        }

        int lefth= maxDepth(root.left);
        int righth= maxDepth(root.right);

        return 1+Math.max(lefth, righth);
    }
}