class Solution {
    public int countNodes(Node root) {

        if(root== null){
            return 0;
        }

        int leftN= countNodes(root.left);
        int rightN= countNodes(root.right);

        return 1+leftN+rightN;
        
    }
}