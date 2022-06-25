package Hacker.Linkedlist;

public class myTest {
    public static void main(String[] args) {
        mySingleLinkedList list1 = new mySingleLinkedList();
        mySingleLinkedList list2 = new mySingleLinkedList();
        /*list1.add_to_last(1);
        list1.add_to_last(2);
        list1.add_to_last(1);
        list1.add_to_last(4);
        list1.add_to_last(5);*/
        list1.add_to_first(1);
        list1.add_to_first(2);
        list1.add_to_first(3);
        list1.add_to_first(4);
        list1.add_to_first(5);
        /*
        for (Iterator iterator = list1.iterator(); iterator.hasNext(); ) {

            System.out.println((Integer) iterator.next());
        }
        */
        System.out.println("---------------");
        list1.printList();
        list1.removeDuplicates();
        list1.printList();

        System.out.println("-------------------------");
        list1.moveKthToLast(2);
        list1.printList();

        //list1.removefirst();
        //list1.printList();
        /*
        list2.add_to_first(4);
        list2.add_to_first(5);
        list2.add_to_first(6);

        System.out.println("--------first link list--------");
        for (Iterator iterator = list1.iterator(); iterator.hasNext(); ) {
            Integer seri1 = (Integer) iterator.next();
            System.out.println(seri1);

        }

        System.out.println("--------secound link list--------");
        for (Iterator iterator = list2.iterator(); iterator.hasNext(); ) {
            Integer seri2 = (Integer) iterator.next();
            System.out.println(seri2);

        }
        System.out.println("---------------------------------");


        mySingleLinkedList merging = mergeList(list1.getFirst(),
                list2.getFirst());

        System.out.println("--------merge two link lists--------");
        for (Iterator iterator = merging.iterator(); iterator.hasNext(); ) {

            System.out.println((Integer) iterator.next());
        }

        System.out.println("--------Duplicate remover--------");
        deleteDups(merging.getFirst());
        for (Iterator iterator = merging.iterator(); iterator.hasNext(); ) {
            System.out.println((Integer) iterator.next());
        }

        System.out.println("-------------------------");
        System.out.println(moveKthToLast(merging.getFirst(), 3));

        System.out.println(deleteNode(list1.getFirst()));
        for (Iterator iterator = list1.iterator(); iterator.hasNext(); ) {

            System.out.println((Integer) iterator.next());
        }
        */
    }

    public static mySingleLinkedList mergeList(myNode list1, myNode list2) {
        mySingleLinkedList mergelist = new mySingleLinkedList();

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if ((Integer) list1.getData() < (Integer) list2.getData()) {
                    mergelist.add_to_first((Integer) list1.getData());
                    list1 = list1.getNext_node();
                } else {
                    mergelist.add_to_first((Integer) list2.getData());
                    list2 = list2.getNext_node();
                }
            } else if (list1 == null) {
                mergelist.add_to_first((Integer) list2.getData());
                list2 = list2.getNext_node();
            } else if (list2 == null) {
                mergelist.add_to_first((Integer) list1.getData());
                list1 = list1.getNext_node();
            }

        }

        return mergelist;
    }
}
