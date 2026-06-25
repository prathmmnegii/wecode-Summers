package xyz;
import java.util.*;

public class treebfs {

    public List<List<Integer>> bfstree(Node root){

    if(root==null){
        return new ArrayList<>();
    }

    List<List<Integer>> ans= new ArrayList<>();

    Queue<Node> q= new LinkedList<>();
    q.add(root);

    while(!q.isEmpty()){

        int size= q.size();
        List<Integer> level= new ArrayList<>();

        for(int i=0; i<size; i++){


            Node n= q.poll();
            level.add(n.val);

            if(n.left!= null){
                q.offer(n.left);
            }
            if(n.right!= null){
                q.offer(n.right);
            }


        }
        ans.add(level);


        
    }
    return ans;



    
}
}
