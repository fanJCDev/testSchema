package Hacker.Graph;

import static Hacker.Graph.RouteExist.generateGraph;
import static Hacker.Graph.RouteExist.isThereRouteBetween;
import static Hacker.Graph.RouteExist.generateGraph;
import static Hacker.Graph.RouteExist.isThereRouteBetween;

public class Test1 {
    public static void main(String[] args) {
        Graph g = generateGraph();


        System.out.println("Is route :"
                + isThereRouteBetween(g, g.getVertices().get(0), g.getVertices().get(g.getVertices().size() - 2)));

    }
}
