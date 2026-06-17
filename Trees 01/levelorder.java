import java.util.*;
class levelorder{

    void lorder(Node root){
        if(root==null){
            return;
        }

        Queue <Node> q= new LinkedList<>();
        q.add(root);  //root add to the queue

        while(!q.isEmpty()){
            Node curr= q.remove();  // removed visited
            System.out.print(curr.data); //print visited

            if(curr.left!= null){
                q.add(curr.left); //add left node
            }
            if(curr.right!= null){
                q.add(curr.right);  //add right node
            }
            

        }
    }
}