package Hacker.list;

import java.util.HashMap;
import java.util.Iterator;

public class Hsmap {
    public static void main(String[] args) {
        HashMap<Integer,String>myhs=new HashMap<>();
        myhs.put(1, "Ali");
        myhs.put(2, "zoli");
        myhs.put(3, "rena");
        myhs.put(4, "Ali");
        myhs.put(5, "Jean");
        myhs.put(6, "Mari");
        System.out.println("My size is " + myhs.size());
        Iterator<Integer> itr = myhs.keySet().iterator();
        System.out.println("my elements ");
        while (itr.hasNext()) {
            System.out.println(myhs.get(itr.next()));
        }
        System.out.println();

        Iterator<String> itr2 = myhs.values().iterator();
        System.out.println("my elements ");
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
