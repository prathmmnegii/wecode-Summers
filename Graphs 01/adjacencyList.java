
import java.util.*;
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        // create adjacency list
        // inner arraylist represents vertex.
        // outer arraylist represents the connections.
        // Let V=5.
        List<List<Integer>> graph= new ArrayList<>();
        for(int i=0; i<V; i++){
            graph.add(new ArrayList<Integer>());
            
        }
        // now create the connections.
        for(int [] edge: edges){
            int u = edge[0];
            int v = edge[1]; 
            graph.get(u).add(v);
            graph.get(v).add(u);
            
        }
        return graph;
    }
}
