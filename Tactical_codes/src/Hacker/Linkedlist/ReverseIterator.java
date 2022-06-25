package Hacker.Linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReverseIterator<Item> implements Iterator<Item> {
    private int i;
    private Item[] data;

    public ReverseIterator(int N, Item[] data) {
        i = N;
        this.data = data;
    }


    public boolean hasNext() {
        return i > 0;
    }

    public Item next() {
        if (!hasNext()) throw new NoSuchElementException();
        return data[--i];
    }


}

