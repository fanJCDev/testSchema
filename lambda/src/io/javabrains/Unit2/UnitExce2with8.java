package io.javabrains.Unit2;

import io.javabrains.Unit1.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static io.javabrains.Unit1.UnitExce1with7.people;

public class UnitExce2with8 {
    public static void main(String[] args) {

        //step 1 : sort list
        //Collections.sort(people, (p1,p2)->p1.getLname().compareTo(p2.getLname()));
        Collections.sort(people, Comparator.comparing(Person::getLname));
        //print all element in list
        System.out.println("---------------------------------");
        performConditionally(people, p -> true, System.out::println);
        //performConditionally(people, p -> true, p-> System.out.println(p));

        //print people start last name with c
        System.out.println("---------print conditionaly lambda start c------------------------");
        performConditionally(people, p -> p.getLname().startsWith("c"), System.out::println);
        //performConditionally(people, p -> p.getLname().startsWith("c"),p-> System.out.println(p));

        System.out.println("---------print conditionaly lambda start a------------------------");
        //performConditionally(people, p -> p.getFname().startsWith("a"), System.out::println);
        performConditionally(people, p -> p.getFname().startsWith("a"),p-> System.out.println(p.getFname()));

    }
    private static void performConditionally(List<Person> plist, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p1 : plist) {
            if (predicate.test(p1)) {
                consumer.accept(p1);
            }
        }
    }
}
