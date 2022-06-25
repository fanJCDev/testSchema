package Hacker.list;

import java.util.*;

public class List_Class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //List<String> myList=new ArrayList<String>();

        List<Friend> myList = new ArrayList<Friend>();
        myList.add(new Friend("Ali", 38));
        myList.add(new Friend("poli", 39));
        myList.add(new Friend("poli", 38));
        myList.add(new Friend("rena", 40));
        myList.add(new Friend("Jean", 25));
        myList.add(new Friend("Mari", 23));

        Comparator<Friend> st = new Comparator<Friend>() {
            @Override
            public int compare(Friend o1, Friend o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }
        };
        Comparator<Friend> ss = new Comparator<Friend>() {
            @Override
            public int compare(Friend o1, Friend o2) {
                // TODO Auto-generated method stub
                return o1.getAge() - o2.getAge();
            }
        };
        //aya mishe ye object mese frend ro be set ezaf kard
		/*
		myList.add_to_first("Ali");
		myList.add_to_first("poli");
		myList.add_to_first("rena");
		myList.add_to_first("Ali");
		myList.add_to_first("Jean");
		myList.add_to_first("Mari");
		*/
        System.out.println("My size is " + myList.size());
		/*
		ListIterator<String>myitr=myList.listIterator();
		System.out.println("my elements ");
		while(myitr.hasNext()) 
		{
			System.out.println(myitr.next());
		}
		System.out.println("oooooooooooooo");
		while(myitr.hasPrevious()) 
		{
			System.out.println(myitr.previous());
		}		
		System.out.println("oooooooooooooo");
		*/
        Collections.sort(myList, st);
        ListIterator<Friend> myitr = myList.listIterator();
        System.out.println("my elements ");
        while (myitr.hasNext()) {
            Friend s = myitr.next();
            System.out.println(s.getName() + " " + s.getAge());
        }
        System.out.println("oooooooooooooo");
        while (myitr.hasPrevious()) {
            Friend s = myitr.previous();
            System.out.println(s.getName() + " " + s.getAge());
        }
        System.out.println("oooooooooooooo");
        System.out.println("oooooooooooooo");
        Collections.sort(myList, ss);
        ListIterator<Friend> myitr1 = myList.listIterator();
        System.out.println("my elements ");
        while (myitr1.hasNext()) {
            Friend s = myitr1.next();
            System.out.println(s.getName() + " " + s.getAge());
        }
        System.out.println("oooooooooooooo");
        while (myitr1.hasPrevious()) {
            Friend s = myitr1.previous();
            System.out.println(s.getName() + " " + s.getAge());
        }
        System.out.println("oooooooooooooo");
    }
}
