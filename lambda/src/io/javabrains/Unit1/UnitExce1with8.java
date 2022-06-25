package io.javabrains.Unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExce1with8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("aAa", "cB", 60),
                new Person("aCa", "d", 50),
                new Person("aEa", "cF", 40),
                new Person("Ga", "h", 61),
                new Person("Ia", "cJ", 51),
                new Person("Ka", "l", 41)
        );
        //step 1 : sort list
        //Collections.sort(people, (p1,p2)->p1.getLname().compareTo(p2.getLname()));
        Collections.sort(people, Comparator.comparing(Person::getLname));
        //print all element in list
        System.out.println("---------------------------------");
        //printAll(people);
        printconditionally(people, p -> true);
        //print people start last name with c
        System.out.println("---------print conditionaly lambda start c------------------------");
        printconditionally(people, p -> p.getLname().startsWith("c"));
        System.out.println("---------print conditionaly lambda start a------------------------");
        printconditionally(people, p -> p.getFname().startsWith("a"));

    }

    private static void printAll(List<Person> plist) {
        for (Person p1 : plist) System.out.println(p1);
    }

    private static void printLastNameWithC(List<Person> plist) {
        for (Person p1 : plist) {
            if (p1.getLname().startsWith("c")) {
                System.out.println(p1);
            }
        }
    }

    private static void printconditionally(List<Person> plist, Condition cond) {
        for (Person p1 : plist) {
            if (cond.test(p1)) {
                System.out.println(p1);
            }
        }
    }
}
