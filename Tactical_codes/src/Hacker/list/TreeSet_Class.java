package Hacker.list;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Comparator<String> st = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2);
            }
        };
        //TreeSet<String> mySet=new TreeSet<String>();
        TreeSet<String> mySet = new TreeSet<String>(st);

        mySet.add("Ali");
        mySet.add("zoli");
        mySet.add("rena");
        mySet.add("Ali");
        mySet.add("Jean");
        mySet.add("Mari");
        System.out.println("-----------------");
        for (String i : mySet) System.out.println(i);
        System.out.println("------------------");
        System.out.println("My size is " + mySet.size());

        Iterator<String> itr = mySet.iterator();
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
