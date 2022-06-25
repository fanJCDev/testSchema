package Hacker.list;

import java.util.*;

public class Hashset_class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashSet<String> mySet = new HashSet<String>();
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
        System.out.println("My size is " + mySet.size());

        Iterator<String> itr = mySet.iterator();
        System.out.println("my elements ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("oooooooooooooo");
        List<String> alistset = new ArrayList<String>(mySet);
        Collections.sort(alistset);
        for (String a : alistset) System.out.println(a);
    }
}

/*
for(Friend Node:myset) System.out.print(Node.getName()+", ");
System.out.println();

//Collections.sort(l);

Comparator<Friend> nc=new Comparator<Friend>() {
	
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


Comparator<Friend> mc=new Comparator<Friend>() {
	
	@Override
	public int compare(Friend o1, Friend o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}
};
//lambda abbreviation

Collections.sort(l,(o1,o2)->o1.getName().CompareTo(o2.getAge()));
for(Friend Node:l)
	System.out.println(Node.getName()+"  "+Node.getAge());

Collections.sort(l,nc);
for(Friend Node:l)
	System.out.println(Node.getName()+"  "+Node.getAge());
System.out.println();
System.out.println();

Collections.sort(l,mc);
for(Friend Node:l)
	System.out.println(Node.getName()+"  "+Node.getAge());
System.out.println();
System.out.println();
*/
