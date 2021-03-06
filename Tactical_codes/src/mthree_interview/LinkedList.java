package mthree_interview;

public class LinkedList {
    static class Node {
        String data;
        Node next;

        Node(String key) {
            this.data = key;
            this.next = null;
        }
    }

    Node head;

    public static LinkedList add(LinkedList list, String key) {
        /*
        ye node jadidi misazim
        node badiye node_jadido be null mibandim
        age list ma khali bashe:
            sare listemono be node jadid vasl mikonim
        ama ageh liste ma khali nabood pas bayad be tahe list ezafe konim:
            node_curr ro be sare list vasl mikonim
            ta zamani ke node_curr be tahe list naresideh:
                node_curr ro be node badi node_curr vasl mikonim
            hala ke be tah residim:
                node_jadid ro be node badi node_curr ke be null vasl bood vasl mikonim
                node badi node jadidam ke otomat be null vasle
        list ro ke be nude_curr vasl bod ro barmigardonim

        */
        Node new_nod = new Node(key);
        new_nod.next = null;
        if (list.head == null) {
            list.head = new_nod;
        } else {
            Node curr = list.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new_nod;
        }
        return list;
    }

    public static void print(LinkedList list) {
        /*
            node_curr ro misazim ke be sare list vasl bashe
            ta zamani ke node_curr be null nareside:
                data ye node_curr ro chaap mikonim
                node_curr ro yedone mibarim jolo
            ye khte khali mizanim
        */
        Node curr = list.head;
        while (curr != null) {
            if (curr.next == null) {
                System.out.print(curr.data);
                break;
            }
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }

    public static LinkedList remove(LinkedList list, String key) {
        /*
          node_hazer be sar list ma eshareh mikone va node_ghable be hichi
          agar node_hazer null nabood va dadeye node_hazer oni bood ke mikhahim
          pas:
            dadye ma sare list boodeh va ma sare list ro pak mikonim
            sare list ma be node bade node_hazer eshareh mikoneh
            ye payam chaap mikonim
            list ro bargardonim
          dar gheyre in soorat yani bayad begardim ta dadeh ro peyda konim:
            tazamanike(node_hazer null nabashe va dadeye node_hazer oni ke mikahim nabashe):
                node_ghable be node_hazer eshare mikoneh
                node_haser be node badei node_hazer eshareh mikoneh
            halacheck mikonim
                    age node_hazer  null nashode bashe:
                        yani yaftim
                        ye payam chaap mikonim
                        node badi node_ghabli be node badi node_hazer eshareh mikone
                    ama age node_hazer mosavi null shod:
                        yani peyda nashod
                        ye payam chaap mikonim
            list ra bargardonim

        */
        Node curr = list.head, per = null;
        if (curr != null && (curr.data).equals(key)) {
            list.head = curr.next;
            System.out.println("Found at top");
            return list;
        }
        while (curr != null && (!(curr.data).equals(key))) {
            per = curr;
            curr = curr.next;
        }
        if (curr != null) {
            per.next = curr.next;
            System.out.println("Found...");
        }
        if (curr == null) {
            System.out.println("not found");
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 1; i <= 10; ++i) {
            list = add(list, (i + ""));
        }
        print(list);
        remove(list, (1 + ""));
        print(list);
        remove(list, (7 + ""));
        print(list);
        remove(list, (10 + ""));
        print(list);
    }
}