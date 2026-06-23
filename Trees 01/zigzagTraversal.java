import java.util.*;
class Solution{
     List<List<Integer>> zigzag(Node root){

        List<List<Integer>> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }

        Queue<Node> q= new LinkedList<>();
        q.offer(root);

        boolean lr= true;

        while(!q.isEmpty()){
            int size= q.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0; i<size; i++){

                Node node= q.poll();

                if(lr==true){
                    level.add(node.val);
                }
                else{
                    level.add(0, node.val);
                }

                if(node.left!= null){
                    q.offer(node.left);
                }

                if(node.right!= null){
                    q.offer(node.right);
                }
            }

            ans.add(level);

            lr = !lr;
        }

        return ans;
     }
}