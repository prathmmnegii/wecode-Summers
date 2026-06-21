import java.util.*;
class Solution {
    public boolean isBipartite(int[][] graph) {

        int n= graph.length;
        int[] color= new int[n];  // sari nodes ka ek array filled with false initially

        for(int i=0; i<n; i++){   //saari nodes traverse kar rahe hai
            if(color[i]==0){      // uncolored node
                if(!dfs(graph, color, i, 1)){  // usme agar dfs false hua (with oppposite color) to false return 
                    return false;
                }
            }
        }
        return true;  //else sab adjacent nodes alag colored hai so return true.
        
    }

    public boolean dfs(int[][] graph, int[] color, int index, int curr){  // do color hunge ek curr or ek -curr

        color[index]= curr;   //current node ko color kr do

        for(int neighbour: graph[index]){   //node ke neighbour mai dfs chalao with opposite color
            if(color[neighbour]==0){        // unvisited node hai
                if(!dfs(graph, color, neighbour, -curr)){  //opposite color ke leye dfs false return kar raha hai
                    return false;
                }
            }
            else if(color[neighbour]==curr){  // dono adjacent nodes ka color same hai isliye false (yaha index or neighbour adjacent hai)
                return false;
            }
        }
        return true;
    }
}