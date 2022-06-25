package Hacker.list;

import java.util.ArrayList;
import java.util.List;

public class List2_Class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Friend> l = new ArrayList<Friend>();
        l.add(new Friend("Ali", 29));
        l.add(new Friend("poli", 39));
        l.add(new Friend("rena", 40));
        l.add(new Friend("Jean", 25));
        l.add(new Friend("Mari", 23));
        for (Friend i : l) System.out.println(i);
        System.out.println();
        //Collections.sort(l);
        for (Friend i : l) System.out.println(i.getName());
    }

}
