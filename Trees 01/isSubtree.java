public class isSubtree {

   boolean isSame(Node p, Node q){

    if(p==null && q==null){
        return true;
    }
    if(p==null || q== null){
        return false;
    }
    if(p.val!= q.val){
        return false;
    }

    return isSame(p.left, q.left) && isSame(p.right, q.right);

    }

    boolean isSub(Node root, Node subroot){   // dhundta hai kya subtree yahi se start ho raha hai??
   
        if(root==null){
            return false;
        }

        if(isSame(root, subroot)){  //agar root hi sam emil gayi to return true
            return true;
        }

        return isSub(root.left, subroot ) || isSub(root.right, subroot); // check in root s left/right subtree
    }
    
}
