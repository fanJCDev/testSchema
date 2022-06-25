package Hacker.Linkedlist;

import java.util.Iterator;

public class SingleLinkedList<Item> {

    private Node<Item> first;
    private int size;

    public SingleLinkedList() {
        size = 0;
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void add(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>(item, oldfirst);
        size++;
    }

    public Iterator<Item> iterator() {

        return new ListIterator<Item>(first);
    }

}

