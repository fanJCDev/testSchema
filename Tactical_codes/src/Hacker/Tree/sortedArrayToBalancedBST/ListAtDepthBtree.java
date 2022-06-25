package Hacker.Tree.sortedArrayToBalancedBST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ListAtDepthBtree {

    ArrayList<ListNode> al = new ArrayList<>();

    //Scanner myObj = new Scanner(System.in);///////////////
    public void levelOrderQueue(Node root) {
        Queue list_queue = new LinkedList();
        int levelNodes = 0;
        if (root == null) return;
        list_queue.add(root);
        while (!list_queue.isEmpty()) {
            levelNodes = list_queue.size();
            //System.out.println(levelNodes);////////////////
            //String userName = myObj.nextLine();////////////
            ListNode head = null;
            ListNode curr = null;
            while (levelNodes > 0) {
                Node n = (Node) list_queue.remove();
                ListNode ln = new ListNode(n.data);
                if (head == null) {
                    head = ln;
                    curr = ln;
                } else {
                    curr.next = ln;
                    curr = curr.next;
                }
                if (n.left != null) list_queue.add(n.left);
                if (n.right != null) list_queue.add(n.right);
                levelNodes--;
            }
            al.add(head);
        }

        display(al);
    }

    public void display(ArrayList<ListNode> al) {
        Iterator it = al.iterator();
        while (it.hasNext()) {
            ListNode head = (ListNode) it.next();
            //System.out.print("->" + head.data);
            while (head != null) {
                System.out.print("->" + head.data);
                head = head.next;
            }
            System.out.println("");
        }
    }
}
