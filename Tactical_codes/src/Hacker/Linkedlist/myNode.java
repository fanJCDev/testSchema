package Hacker.Linkedlist;

public class myNode {
    private Integer data;
    private myNode next_node;

    public myNode(int data, myNode next_node) {
        this.data = data;
        this.next_node = next_node;
    }
    public myNode(int data){
        this.data=data;
        this.next_node=null;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public myNode getNext_node() {
        return next_node;
    }

    public void setNext_node(myNode next_node) {
        this.next_node = next_node;
    }
}
