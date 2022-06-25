package Hacker.list;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQue_Class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Comparator<String> st = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return -1 * o1.compareTo(o2);
            }
        };
        //PriorityQueue<String> myQ=new PriorityQueue<String>();
        PriorityQueue<String> myQ = new PriorityQueue<String>(st);
        //PriorityQueue<String> myQ=new PriorityQueue<String>((o1,o2)->-1*o1.compareTo(o2));

        myQ.add("Ali");
        myQ.add("zoli");
        myQ.add("rena");
        myQ.add("Ali");
        myQ.add("Jean");
        myQ.add("Mari");
        System.out.println("-------------------");
        for (String i : myQ) System.out.println(i);
        System.out.println("-------------------");
        System.out.println("My size is " + myQ.size());

        Iterator<String> itr = myQ.iterator();
        System.out.println("my elements ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("oooooooooooooo");

        //List<String> alistset = new ArrayList<String>(mySet);

        //Collections.sort(alistset);
        //for(String Node: alistset)System.out.println(Node);

    }

}
