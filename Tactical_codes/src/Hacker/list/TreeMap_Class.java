package Hacker.list;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMap_Class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Comparator<Integer> it = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o1 - o2;
                //return o2-o1;
            }
        };
        //TreeMap<Integer,String> myQ=new TreeMap<Integer,String>();
        TreeMap<Integer, String> myQ = new TreeMap<Integer, String>(it);
        //TreeMap<Integer,String> myQ=new TreeMap<Integer,String>((o1,o2)->o2-o1);

        myQ.put(1, "Ali");
        myQ.put(2, "zoli");
        myQ.put(3, "rena");
        myQ.put(4, "Ali");
        myQ.put(5, "Jean");
        myQ.put(6, "Mari");

        System.out.println("My size is " + myQ.size());

        Iterator<Integer> itr = myQ.keySet().iterator();
        System.out.println("my elements ");
        while (itr.hasNext()) {
            System.out.println(myQ.get(itr.next()));
        }
        System.out.println();

        Iterator<String> itr2 = myQ.values().iterator();
        System.out.println("my elements ");
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }

}
