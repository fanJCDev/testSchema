package tree;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.FileWriter;
import java.util.ArrayList;

public class Tree {
    private ArrayList<Edge> edges;
    private ArrayList<Node> nodes;

    public Tree() {
        edges = new ArrayList<Edge>();
        nodes = new ArrayList<Node>();
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public Node getNodeById(int id) {
        for (Node node : nodes) {
            if (node.getId() == id) {
                return node;
            }
        }
        return null;
    }

    public Edge getEdgeBySourceId(int id) {
        try {
            for (Edge edge : edges) {
                if (edge.getSourceNode().getId() == id) {
                    return edge;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Edge getEdgeByTargetId(int id) {
        try {
            for (Edge edge : edges) {
                if (edge.getTargetNode().getId() == id) {
                    return edge;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean removeNode(Node node) {
        boolean result = false;
        try {
            for (Node n : nodes) {
                if (n.equals(node)) {
                    if (this.getEdgeBySourceId(node.getId()) == null) {
                        nodes.remove(node);
                        result = true;
                        return result;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean removeEdge(Edge edge) {
        boolean result = false;
        try {
            for (Edge e : edges) {
                if (e.equals(edge)) {
                    if (this.getNodeById(edge.getTargetNode().getId()) == null) {
                        edges.remove(edge);
                        result = true;
                        return result;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String getXML() {
        Element element;
        String xml = "";
        try {
            Element graphml = new Element("graphml");
            Document document = new Document(graphml);
            document.setRootElement(graphml);

            element = new Element("key");
            element.setAttribute("id", "label");
            element.setAttribute("for", "all");
            element.setAttribute("attr.name", "label");
            element.setAttribute("attr.type", "string");
            document.getRootElement().addContent(element);

            element = new Element("key");
            element.setAttribute("id", "weight");
            element.setAttribute("for", "node");
            element.setAttribute("attr.name", "weight");
            element.setAttribute("attr.type", "double");
            document.getRootElement().addContent(element);

            Element graph = new Element("graph");
            graph.setAttribute("edgedefault", "directed");

            for (Node node : this.getNodes()) {
                element = new Element("node");
                element.setAttribute("id", String.valueOf(node.getId()));

                String labelWeight = node.getDate();
                if (node.getWeight() > 0) {
                    labelWeight += "==" + node.getWeight();
                }

                element.addContent(new Element("data").setText(labelWeight).setAttribute("key", "label"));

                element.addContent(new Element("data").setText(String.valueOf(node.getWeight())).setAttribute("key", "weight"));
                graph.addContent(element);
            }

            for (Edge edge : this.getEdges()) {
                element = new Element("edge");
                element.setAttribute("source", String.valueOf(edge.getSourceNode().getId()));
                element.setAttribute("target", String.valueOf(edge.getTargetNode().getId()));

                element.addContent(new Element("data").setText(String.valueOf(edge.getWeight())).setAttribute("key", "label"));
                graph.addContent(element);
            }

            document.getRootElement().addContent(graph);


            XMLOutputter xmlOutputter = new XMLOutputter();
            xmlOutputter.setFormat(Format.getPrettyFormat());
            xmlOutputter.output(document, new FileWriter("file2.xml"));
            xml = xmlOutputter.outputString(document);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xml;
    }
}


