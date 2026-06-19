public class sameTree {

    public boolean isSame(Node p, Node q){
        if(p==null && q==null){
            return true;
        }

        if(p==null || q==null){
            return false;
        }

        if(p.val!= q.val){
            return false;
        }

        return isSame(p.left, q.left) && isSame(p.right, q.right);

    }
}
    

