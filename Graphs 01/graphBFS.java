import java.util.*;
class Solution{

    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){

        int V= adj.size();
        boolean[] visited= new boolean[V];
        visited[0]= true;

        ArrayList<Integer> bfs= new ArrayList<>();
        bfs.add(0);

        Queue <Integer> q= new LinkedList<>();
        q.add(0);

        while(!q.isEmpty()){
            int vertex= q.poll();

            for(int neighbour: adj.get(vertex)){
                if(!visited[neighbour]){
                    visited[neighbour]= true;
                    bfs.add(neighbour);
                    q.add(neighbour);

                }

            }

        }

        return bfs;

        




    }
}