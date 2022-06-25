package Hacker.Linkedlist;

import java.util.Iterator;

public class mySingleLinkedList {

    private myNode first;
    //private myNode tail;
    private int size;

    public mySingleLinkedList() {
        size = 0;
        first = null;
        //tail = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void add_to_first(Integer item) {

        myNode new_node = new myNode(item);
        new_node.setNext_node(first);
        first = new_node;
        size++;
    }

    /*
        public void add_to_last(Integer item) {

            myNode new_node = new myNode(item);
            if (first == null) {
                first = new_node;
                tail = new_node;
            } else {
                tail.setNext_node(new_node);
                //newNode will become new tail of the list
                tail = new_node;
            }
        }
    */

    public void removeDuplicates() {

        myNode curr = first;
        while (curr != null) {
            myNode temp = curr;
            while (temp.getNext_node() != null) {
                if (temp.getNext_node().getData() == curr.getData()) {
                    temp.setNext_node(temp.getNext_node().getNext_node());
                } else {
                    temp = temp.getNext_node();
                }
            }
            curr = curr.getNext_node();
        }
    }

    public myNode moveKthToLast(int k){
        myNode p1=first;
        myNode p2=first;
        for (int i=0;i<k;i++){
            if(p1==null) return null;
            p1=p1.getNext_node();
        }
        while (p1!=null){
            p1=p1.getNext_node();
            p2=p2.getNext_node();
        }
        return p2;
    }

    public void printList() {
        myNode temp = first;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext_node();
        }
        System.out.println();
    }


    public int moveKthToLast1(myNode head, int k) {
        if (head == null) {
            return 0;
        }
        int index = moveKthToLast1(head.getNext_node(), k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + head.getData());
        }
        return index;
    }

    public boolean deleteNode(myNode n) {
        if (n == null || n.getNext_node() == null) {
            return false; // Failure
        }
        myNode next = n.getNext_node();
        n.setData(next.getData());
        n.setNext_node(next.getNext_node());
        return true;
    }


    public Iterator iterator() {

        return new myListIterator(first);
    }

    public myNode getFirst() {
        return first;
    }

}

