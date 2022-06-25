<%@ page import="tree.Node" %>
<%@ page import="tree.Tree" %>
<%@ page import="tree.Edge" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    boolean newTree = Boolean.parseBoolean(request.getParameter("newTree"));
    if (newTree) {
        Node root = new Node();
        root.setNode("Root", 0);
        Tree tree = new Tree();
        tree.addNode(root);
        request.getSession().setAttribute("TreeObject", tree);
        response.sendRedirect("index.jsp");
    } else if (request.getSession().getAttribute("TreeObject") != null) {

        String action;

        if (request.getParameter("action") != null) {
            action = request.getParameter("action");
        } else {
            action = "";
        }

        Tree tree = (Tree) request.getSession().getAttribute("TreeObject");
        //---------------------------- Insert ----------------------------------------------
        if (action.equals("ins")) {

            int sourceId = Integer.parseInt(request.getParameter("nodeId"));

            String data = request.getParameter("q&a");
            double weight;
            try {
                weight = Double.parseDouble(request.getParameter("weight"));
            } catch (Exception e) {
                weight = 0;
            }
            double probability;
            try {
                probability = Double.parseDouble(request.getParameter("probability"));
            } catch (Exception e) {
                probability = 0;
            }

            Node node = new Node();
            node.setNode(data, weight);
            //test
            tree.getNodeById(sourceId).setWeight(0);
            Edge edge = new Edge(tree.getNodeById(sourceId), node, probability);

            tree.addNode(node);
            tree.addEdge(edge);
            request.getSession().setAttribute("TreeObject", tree);
            response.sendRedirect("index.jsp");

       //---------------------------- Delete ----------------------------------------------
        } else if (action.equals("del")) {

            int nodeId = Integer.parseInt(request.getParameter("nodeId"));
            Node node = tree.getNodeById(nodeId);
            if (tree.removeNode(node)) {
                if (tree.getEdges() != null) {
                    try {
                        for (Edge edge : tree.getEdges()) {
                            if (edge.getTargetNode().getId() == nodeId) {
                                tree.removeEdge(edge);
                            }
                        }
                    } catch (Exception e) {

                    }
                }
                request.getSession().setAttribute("TreeObject", tree);
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("index.jsp?err=true");
            }
        }
    }

%>
