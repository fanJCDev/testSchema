package Hacker.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;
import Hacker.Linkedlist.ReverseIterator;

public class StackWithArray<Item> {
    private Item[] a; // array of items
    private int N;
    public StackWithArray(){
        super();
        a = (Item[]) new Object[10];
    }
    public boolean isEmpty() {
        return N == 0;
    }
    public int size(){
        return N;
    }
    private void resize(int capacity) {
        assert capacity >= N;
        Item[] temp = (Item[]) new Object[capacity];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }
    public void push(Item item) {
        if (N == a.length)
            System.out.println("Stack is full");
        //resize(2 * Node.length); // double size of array if necessary
        a[N++] = item;
    }
    public Item pop() {
        if (isEmpty())
            throw new NoSuchElementException("Stack underflow");
        Item item = a[N - 1];
        a[N - 1] = null;
        N--;
        // shrink size of array if necessary
        //if (N > 0 && N == Node.length / 4)
        //	resize(Node.length / 2);
        return item;
    }
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return a[N - 1];
    }
    public Iterator<Item> iterator() {
        return new ReverseIterator(N, a);
    }
    public static void main(String[] args) {
        System.out.println("Stack with array");
        StackWithArray<String> stack = new StackWithArray<String>();
        stack.push("jack");
        stack.push("mike");
        stack.push("dany");
        for (Iterator iterator = stack.iterator(); iterator.hasNext(); ) {
            String type = (String) iterator.next();
            System.out.println(type);

        }

        System.out.println(stack.pop() + "---->***");
        System.out.println("------ items after pop ------");

        for (Iterator iterator = stack.iterator(); iterator.hasNext(); ) {
            String type = (String) iterator.next();
            System.out.println(type);

        }


    }
}
