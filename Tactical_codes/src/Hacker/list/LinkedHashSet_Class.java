package Hacker.list;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedHashSet<String> mySet = new LinkedHashSet<String>();
		/*
		myset.add_to_first(new Friend("Ali", 29));
		myset.add_to_first(new Friend("poli", 39));
		myset.add_to_first(new Friend("rena", 40));
		myset.add_to_first(new Friend("Jean", 25));
		myset.add_to_first(new Friend("Mari", 23));
		*/
        //aya mishe ye object mese frend ro be set ezaf kard
        mySet.add("Ali");
        mySet.add("poli");
        mySet.add("rena");
        mySet.add("Ali");
        mySet.add("Jean");
        mySet.add("Mari");
        System.out.println("--------my way---------");
        for (String i : mySet) System.out.println(i);
        System.out.println("-----------------");
        System.out.println("My size is " + mySet.size());
        Iterator<String> myitr = mySet.iterator();
        System.out.println("my elements ");
        while (myitr.hasNext()) {
            System.out.println(myitr.next());
        }
        System.out.println("oooooooooooooo");
        for (String i : mySet) System.out.println(i);
        System.out.println("oooooooooooooo");
    }
}
