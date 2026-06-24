public class ceil {

    public int ceil(TreeNode root, int key){

        int ceil=-1;

        while(root!= null){
            if(root.val==key){
                return root.data;
            }

            if(key>root.data){
                root=root.right;
            }

            else{
                ceil= root.data;
                root=root.left;
            }
        }
        return ceil;
    }
    
}
