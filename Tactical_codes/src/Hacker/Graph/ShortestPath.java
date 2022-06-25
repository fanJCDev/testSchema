package Hacker.Graph;

import java.util.Scanner;

public class ShortestPath {
    // A utility function to find the vertex with minimum distance value,
    // from the set of vertices not yet included in shortest path tree
    static final int V = 9;
    int minDistance(int dist[], Boolean sptSet[]) {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    // A utility function to print the constructed distance array
    void printSolution(int dist[], int n) {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " tt " + dist[i]);
    }

    // Funtion that implements Dijkstra'unKnownProb single source shortest path
    // algorithm for Node graph represented using adjacency matrix
    // representation
    void dijkstra(int graph[][], int src) {
        Scanner myObj = new Scanner(System.in);
        int dist[] = new int[V]; // The output array. dist[i] will hold
        // the shortest distance from src to i

        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];

        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        /*
        System.out.println("src= " + src);
        String name = myObj.nextLine();
        */
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            /*
            System.out.println("********************************");
            */
            int u = minDistance(dist, sptSet);
            /*System.out.println("u=" + u);
            name = myObj.nextLine();
            */
            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update dist value of the adjacent vertices of the
            // picked vertex.
            //System.out.println("----------------------------------");
            for (int v = 0; v < V; v++) {

                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                /*System.out.println("-------------------------------------------");
                System.out.println("v=" + v + "\nu=" + u + "\nspt[v]=" + sptSet[v] + "\ngraf[u,v]=" + graph[u][v]
                        + "\ndist[u]=" + dist[u] + "\njame dist[u] ,graf[u,v]=" + (dist[u] + graph[u][v]) + "\ndist[v]="
                        + dist[v] + "\ncondition=" + (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v] < dist[v]));
*/
                if (!sptSet[v] && graph[u][v] != 0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                    /*
                    System.out.println("new dis[v]=" + dist[v] + "=" + dist[u] + graph[u][v] + "");
                    name = myObj.nextLine();
                    System.out.println("-------------------------------------------");
                    */
                }

            }
            //System.out.println("**********************************");
        }

        // print the constructed distance array
        printSolution(dist, V);
    }

    // Driver method
    public static void main(String[] args) {
        /* Let us create the example graph discussed above */
        //If you have N elements, the minimum height of Node binary tree will be log2(N)+1.


        int graph[][] = new int[][]{
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        ShortestPath t = new ShortestPath();
        t.dijkstra(graph, 0);
    }
}
