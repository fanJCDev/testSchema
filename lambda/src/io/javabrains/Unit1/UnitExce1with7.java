package io.javabrains.Unit1;

import java.util.*;

public class UnitExce1with7 {
    public static List<Person> people = Arrays.asList(
            new Person("aA","cB",60),
            new Person("aC","d",50),
            new Person("aE","cF",40),
            new Person("G","h",61),
            new Person("I","cJ",51),
            new Person("K","l",41));
    public static void main(String[] args) {

        //step 1 : sort list

        //with java 7

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLname().compareTo(o2.getLname());
            }
        });

        //with java 7

        //print all element in list

        //with java 7
        System.out.println("---------------------------------");
        printAll(people);
        //with java 7


        //print people start last name with c

        //with java 7
        System.out.println("---------------------------------");
        printLastNameWithC(people);
        //with java 7

        //with java 7
        System.out.println("---------print conditionaly lname start c------------------------");
        printconditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLname().startsWith("c");
            }
        });
        //with java 7


        //with java 7
        System.out.println("---------------------------------");
        printconditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFname().startsWith("a");
            }
        });
        //with java 7

    }
    private static void printAll(List<Person> plist){
        for(Person p1:plist) System.out.println(p1);
    }
    private static void printLastNameWithC(List<Person> plist){
        for(Person p1:plist){
            if(p1.getLname().startsWith("c")){
                System.out.println(p1);
            }
        }
    }
    private static void printconditionally(List<Person> plist, Condition cond){
        for(Person p1:plist){
            if(cond.test(p1)){
                System.out.println(p1);
            }
        }
    }
}
interface Condition{
    boolean test(Person p);
}