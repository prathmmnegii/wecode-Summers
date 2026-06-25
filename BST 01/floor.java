class floor{
    int floor=-1;
    public int floor(Node root, int key){
        while(root!=null){


            if(root.val==key){
                return root.val;
            }

            if(key> root.val){
                floor= root.val;
                root= root.right;
            }
            else{
                
                root= root.left;
            }
        }
        return floor;
    }
}