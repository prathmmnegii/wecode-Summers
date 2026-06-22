class balancedT{

    boolean isBT(TreeNode root){
        return height(root) != -1;

    }

    public int height(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftH= height(root.left);   //agar neeche kahi bhi balanced bt nahi mila to use upar propagate krdo
        if(leftH==-1){
            return -1;
        }

        int rightH= height(root.right);
        if(rightH==-1){
            return -1;
        }

        if(Math.abs(leftH- rightH) >1){
            return -1;
        }
        return Math.max(leftH, rightH)+1;
    }
}