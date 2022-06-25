package Hacker.Linkedlist;

import java.util.Iterator;

public class TestLinkedList {
    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<String>();

        list.add("apple");
        list.add("orange");
        list.add("banana");

        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            String fruit = (String) iterator.next();
            System.out.println(fruit);

        }

    }
}
