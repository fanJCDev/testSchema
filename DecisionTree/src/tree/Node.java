package tree;

import utility.Global;

public class Node {
    private int id;
    private String data;
    private double weight;

    public Node() {
        this.id = ++Global.ID;
    }

    public void setNode(String data, double weight) {
        this.setDate(data);
        this.setWeight(weight);
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return data;
    }

    public void setDate(String date) {
        this.data = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
