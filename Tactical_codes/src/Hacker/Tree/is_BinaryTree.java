package Hacker.Tree;


public class is_BinaryTree {

    Node root;

    /* can give min and max value according to your code or
    can write Node function to find min and max value of tree. */

    /* returns true if given search tree is binary
     search tree (efficient version) */
    boolean isBST()  {
        return isBSTUtil(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }

    /* Returns true if the given tree is Node BST and its
      values are >= min and <= max. */
    boolean isBSTUtil(Node node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }

    public static void main(String[] args) {
        is_BinaryTree tree = new is_BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(6);/*
        tree22.root.left.left.left = new Node(8);*/
        System.out.println(tree.isBST());

        is_BinaryTree tree1 = new is_BinaryTree();
        tree1.root = new Node(4);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(6);
        tree1.root.left.left = new Node(1);
        tree1.root.left.right = new Node(3);
        tree1.root.right.left = new Node(5);
        tree1.root.right.right = new Node(7);
        System.out.println(tree1.isBST());


    }
}
