import java.util.*;
class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        // Adjacency List banayenge
        List<List<Integer>> adj = new ArrayList<>();

        // Har node ke liye ek khaali list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Edge list ko adjacency list mein convert karna
        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            // Undirected graph hai, isliye dono taraf edge add hogi
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Visited array taaki ek node par baar-baar na jaayein
        boolean[] visited = new boolean[n];

        // Source se DFS start karo
        return dfs(adj, visited, source, destination);
    }

    boolean dfs(List<List<Integer>> adj, boolean[] visited,
                int source, int destination) {

        // Agar destination mil gayi to path exist karta hai
        if (source == destination) {
            return true;
        }

        // Current node ko visited mark karo
        visited[source] = true;

        // Current node ke saare neighbours par jao
        for (int neighbour : adj.get(source)) {

            // Sirf unvisited neighbour par DFS lagao
            if (!visited[neighbour]) {

                // Agar kisi path se destination mil jaaye
                // to turant true return kar do
                if (dfs(adj, visited, neighbour, destination)) {
                    return true;
                }
            }
        }

        // Kisi bhi path se destination nahi mili
        return false;
    }
}