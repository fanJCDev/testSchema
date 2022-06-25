package Hacker.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List_Arraylist_Class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Friend> l = new ArrayList<Friend>();
        l.add(new Friend("Ali", 29));
        l.add(new Friend("poli", 39));
        l.add(new Friend("rena", 40));
        l.add(new Friend("Jean", 25));
        l.add(new Friend("Mari", 23));
        for (Friend a : l) System.out.print(a.getName() + ", ");
        System.out.println();
        //Collections.sort(l);

        Comparator<Friend> nc = new Comparator<Friend>() {

            @Override
            public int compare(Friend o1, Friend o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }
        };
        //lambda abbreviation
		/*
		Collections.sort(l,(o1,o2)->o1.getName().CompareTo(o2.getAge()));
		for(Friend Node:l)
			System.out.println(Node.getName()+"  "+Node.getAge());
		*/

        Comparator<Friend> mc = new Comparator<Friend>() {

            @Override
            public int compare(Friend o1, Friend o2) {
                // TODO Auto-generated method stub
                return o1.getAge() - o2.getAge();
            }
        };
        //lambda abbreviation
		/*
		Collections.sort(l,(o1,o2)->o1.getName().CompareTo(o2.getAge()));
		for(Friend Node:l)
			System.out.println(Node.getName()+"  "+Node.getAge());
		*/
        Collections.sort(l, nc);
        for (Friend a : l)
            System.out.println(a.getName() + "  " + a.getAge());
        System.out.println();
        System.out.println();

        Collections.sort(l, mc);
        for (Friend a : l)
            System.out.println(a.getName() + "  " + a.getAge());
        System.out.println();
        System.out.println();
    }
}
