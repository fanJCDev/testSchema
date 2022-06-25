package Hacker.Linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class myListIterator implements Iterator {
    private myNode current;

    public myListIterator(myNode first) {
        current = first;
    }

    public boolean hasNext() {
        return current != null;
    }


    public Integer next() {
        if (!hasNext())
            throw new NoSuchElementException();
        Integer item = current.getData();
        current = current.getNext_node();
        return item;
    }
}
