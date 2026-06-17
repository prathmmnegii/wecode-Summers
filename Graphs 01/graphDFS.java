import java.util.*;
class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V= adj.size();
        ArrayList<Integer> Result= new ArrayList<>();
        boolean[] visited= new boolean[V];
        int startVertex=0;
        
        dfsHelper(startVertex, visited, Result, adj );
        return Result;
        
    
    }
    
    void dfsHelper(int startVertex, boolean[] visited,  ArrayList<Integer> Result, ArrayList<ArrayList<Integer>> adj  ){
        
        visited[startVertex]= true;
        Result.add(startVertex);
        
        for(int i=0; i< adj.get(startVertex).size(); i++){
            if(! visited[adj.get(startVertex).get(i)]){
                dfsHelper(adj.get(startVertex).get(i), visited, Result, adj );
            }
        }
    }
}
