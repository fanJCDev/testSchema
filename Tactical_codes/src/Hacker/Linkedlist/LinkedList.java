package Hacker.Linkedlist;

public class LinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node head;
    // **************INSERTION**************
    // Method to insert Node new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create Node new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }
    // **************TRAVERSAL**************
    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.print("\nLinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " -> ");

            // Go to next node
            currNode = currNode.next;
        }
        System.out.println("nil\n");
    }
    // **************DELETION BY KEY**************
    // Method to delete Node node in the LinkedList by KEY
    public static LinkedList deleteByKey(LinkedList list, int key) {
        // Store head node
        Node currNode = list.head, prev = null;

        //
        // CASE 1:
        // If head node itself holds the key to be deleted

        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(key + " found and deleted");

            // Return the updated List
            return list;
        }

        //
        // CASE 2:
        // If the key is somewhere other than at head
        //

        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null && currNode.data != key) {
            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }

        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currNode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;

            // Display the message
            System.out.println(key + " found and deleted");
        }

        //
        // CASE 3: The key is not present
        //

        // If key was not present in linked list
        // currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }

        // return the List
        return list;
    }
    // **************DELETION AT A POSITION**************
    // Method to delete Node node in the LinkedList by POSITION
    public static LinkedList deleteAtPosition(LinkedList list, int index) {
        // Store head node
        Node currNode = list.head, prev = null;

        //
        // CASE 1:
        // If index is 0, then head node itself is to be
        // deleted

        if (index == 0 && currNode != null) {
            list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(
                    index + " position element deleted");

            // Return the updated List
            return list;
        }

        //
        // CASE 2:
        // If the index is greater than 0 but less than the
        // size of LinkedList
        //
        // The counter
        int counter = 0;

        // Count for the index to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null) {

            if (counter == index) {
                // Since the currNode is the required
                // position Unlink currNode from linked list
                prev.next = currNode.next;

                // Display the message
                System.out.println(
                        index + " position element deleted");
                break;
            } else {
                // If current position is not the index
                // continue to next node
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        // If the position element was found, it should be
        // at currNode Therefore the currNode shall not be
        // null
        //
        // CASE 3: The index is greater than the size of the
        // LinkedList
        //
        // In this case, the currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(
                    index + " position element not found");
        }

        // return the List
        return list;
    }
    public static Node moveKtoLast(LinkedList list, int k) {

        Node p1 = list.head;
        Node p2 = list.head;
        for (int i = 0; i < k; i++) {
            if (p1 == null) return null;
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
    public static Node partition(Node node, int x) {
        Node head = node;
        Node tail = node;

        while (node != null) {
            Node next = node.next;
            if (node.data < x) {
                /* Insert node at head. */
                node.next = head;
                head = node;
            } else {
                /* Insert node at tail. */
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;

        // The head has changed, so we need to return it to the user.
        return head;
    }
    public static void deleteDuplicate(LinkedList list) {
        Node curr = list.head;
        while (curr != null) {
            Node temp = curr;
            while (temp.next != null) {
                if (temp.next.data == curr.data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            curr = curr.next;
        }
        //return list;
    }
    // **************MAIN METHOD**************
    // method to create Node Singly linked list with n nodes
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();
        //
        // ******INSERTION******
        //
        // Insert the values
        list = insert(list, 1);
        list = insert(list, 8);
        list = insert(list, 2);
        list = insert(list, 7);
        list = insert(list, 3);
        list = insert(list, 6);
        list = insert(list, 4);
        list = insert(list, 5);
        // Print the LinkedList
        printList(list);
        // ******DELETION BY KEY******
        // Delete node with value 1 In this case the key is ***at head***
        deleteByKey(list, 1);
        printList(list);
        // Delete node with value 4 In this case the key is present ***in the middle***
        deleteByKey(list, 4);
        printList(list);
        // Delete node with value 10 In this case the key is ***not present***
        deleteByKey(list, 10);
        printList(list);
        // Delete node at position 0 In this case the key is ***at head***
        deleteAtPosition(list, 0);
        printList(list);
        // Delete node at position 2 In this case the key is present ***in themiddle***
        deleteAtPosition(list, 2);
        printList(list);
        // Delete node at position 10 In this case the key is ***not present***
        deleteAtPosition(list, 10);
        printList(list);
        list.deleteDuplicate(list);

        list.head = moveKtoLast(list, 1);
        printList(list);

        list.head=partition(list.head,5);
        printList(list);

    }
}
