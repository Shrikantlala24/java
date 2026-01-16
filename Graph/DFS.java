import java.util.LinkedList;

public class DFS {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
    }
    
    public class Graph {
        private int __vertices;
        private LinkedList<Integer> adjList[];
        
        public Graph(int v) {
            this.__vertices  = v;
            this.adjList = new LinkedList[v];
            for(int i = 0; i < v; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        
        public void addEdge(int src, int dest) {
            adjList[src].add(dest);
        }
        
        public void DFS(int start) {
            boolean[] visited = new boolean[__vertices];
            DFSUtil(start, visited);
        }

        private void DFSUtil(int vertex, boolean[] visited) {
            visited[vertex] = true;
            System.out.print(vertex + " ");

            for (int adj : adjList[vertex]) {
                if (!visited[adj]) {
                    DFSUtil(adj, visited);
                }
            }
        }
    }
    
}
