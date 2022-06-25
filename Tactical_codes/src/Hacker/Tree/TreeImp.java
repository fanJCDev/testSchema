package Hacker.Tree;

public class TreeImp {
    public static void main(String[] args) {
        TreeImp treeImp = new TreeImp();
        Node root = new Node(5);
        System.out.println("Binary TreeImp Example");
        System.out.println("Building treeImp with root value " + root.data);
        treeImp.insert(root, 2);
        treeImp.insert(root, 4);
        treeImp.insert(root, 8);
        treeImp.insert(root, 6);
        treeImp.insert(root, 7);
        treeImp.insert(root, 3);
        treeImp.insert(root, 9);
        System.out.println("Traversing treeImp in order");
        treeImp.traverseInOrder(root);
        treeImp.search(root, 9);
    }

    public void insert(Node node, int value) {
        /////////////////////////////////////////////////////
        if (value < node.data) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.data);
                node.left = new Node(value);
            }
        }
        ///////////////////////////////////////////////////////
        else if (value > node.data) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.data);
                node.right = new Node(value);
            }
        }
        ////////////////////////////////////////////////////////////

    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public boolean ifNodeExists(Node node, int key) {
        if (node == null)
            return false;

        if (node.data == key)
            return true;

        // then recur on left sutree /
        boolean res1 = ifNodeExists(node.left, key);

        // node found, no need to look further
        if (res1) return true;

        // node is not found in left,
        // so recur on right subtree /
        boolean res2 = ifNodeExists(node.right, key);
        return res2;
    }

    public void search(Node node, int key) {
        if (ifNodeExists(node, key))
            System.out.println("\n" + key + " found");
        else
            System.out.println("\n" + key + "NOT FOUND");
    }
}
