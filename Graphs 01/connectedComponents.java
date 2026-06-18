import java.util.*;
class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adjList= new ArrayList<>();
        for(int i=0; i<V; i++){
            adjList.add(new ArrayList<>()); //vertex
        }
        
        for(int [] edge : edges){
            int u= edge[0];
            int v= edge[1];
            
            adjList.get(u).add(v);
            adjList.get(v).add(u);  //fill; edges connections
        }
        
        boolean [] visited= new boolean[V];
        ArrayList<ArrayList<Integer>> allcom= new ArrayList<>();
        
        for (int i=0; i<V; i++){
            if(!visited[i]){
                ArrayList<Integer> com = new ArrayList<>();
                dfsHelper(i, adjList, visited, com);
                allcom.add(com);
                
            }
        }
        return allcom;
        

        
    }
    
    void dfsHelper(int vertex, ArrayList<ArrayList<Integer>> adjList, boolean[] visited, ArrayList<Integer> com){
        visited[vertex]= true;
        com.add(vertex);
        for(int neighbour: adjList.get(vertex)){
            if(!visited[neighbour]){
                dfsHelper(neighbour, adjList, visited, com);
            }
            
        }
        
        
    }
}