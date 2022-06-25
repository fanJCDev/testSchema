package applicatin;

import tree.Edge;
import tree.Node;
import tree.Tree;

public class Program {
    public static void main(String[] args) {

        Node node = new Node();
        node.setNode("Arash", 5);

        Node node1 = new Node();
        node1.setNode("Rajabian", 5);


        Node node2 = new Node();
        node2.setNode("Yazdi", 5);


        Node node3 = new Node();
        node3.setNode("Tanha", 5);

        Edge edge = new Edge(node, node1);
        Edge edge1 = new Edge(node1, node2);
        Edge edge2 = new Edge(node2, node3);


        Tree tree = new Tree();
        tree.addNode(node);
        tree.addNode(node1);
        tree.addNode(node2);
        tree.addNode(node3);

        tree.addEdge(edge);
        tree.addEdge(edge1);
        tree.addEdge(edge2);

        String xml = tree.getXML();
        System.out.println(xml);


    }
}
