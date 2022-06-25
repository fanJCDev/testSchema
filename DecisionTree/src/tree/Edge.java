package tree;

public class Edge {

    private Node sourceNode;
    private Node targetNode;
    private double weight;

    public Edge(Node source, Node target) {
        this.setWeight(0);
        this.setSourceNode(source);
        this.setTargetNode(target);
    }

    public Edge(Node source, Node target, double weight) {
        this.setWeight(weight);
        this.setSourceNode(source);
        this.setTargetNode(target);
    }

    public Node getSourceNode() {
        return sourceNode;
    }

    public void setSourceNode(Node sourceNode) {
        this.sourceNode = sourceNode;
    }

    public Node getTargetNode() {
        return targetNode;
    }

    public void setTargetNode(Node targetNode) {
        this.targetNode = targetNode;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
