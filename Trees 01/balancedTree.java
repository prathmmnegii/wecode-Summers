public class balancedTree {
    
    int helper(Node root){
        if(root==null){
            return 0;
        }

        int lefth= helper(root.left);
        int righth= helper(root.right);

        if(lefth==-1 && righth==-1){
        return -1;
        }

        if(Math.abs(lefth- righth)> 1){
            return -1;
        }

        return 1+ Math.max(lefth, righth);

    }

    public boolean Balanced(Node root){
        return helper(root)!= -1;
    }
}
