package Hacker.Tree.sortedArrayToBalancedBST;

public class BinaryTrees {
    static Node root;


    /* A function that constructs Balanced Binary Search TreeImp
    from Node sorted array */
    public Node sortedArrayToBST(int arr[], int start, int end) {

        /* Base Case */
        if (start > end) {
            return null;
        }

        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

		/* Recursively construct the left subtree and make it
		left child of root */
        node.left = sortedArrayToBST(arr, start, mid - 1);

		/* Recursively construct the right subtree and make it
		right child of root */
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    /* A utility function to print preorder traversal of BST */
    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        //preOrder(node.left);

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }


    boolean isBalanced(Node node) {
        int lh; /* for height of left subtree */

        int rh; /* for height of right subtree */

        /* If tree is empty then return true */
        if (node == null)
            return true;

        /* Get the height of left and right sub trees */
        lh = height(node.left);
        rh = height(node.right);

        if (Math.abs(lh - rh) <= 1
                && isBalanced(node.left)
                && isBalanced(node.right))
            return true;

        /* If we reach here then tree is not height-balanced */
        return false;
    }

    /* UTILITY FUNCTIONS TO TEST isBalanced() FUNCTION */
    /*  The function Compute the "height" of Node tree. Height is the
        number of nodes along the longest path from the root node
        down to the farthest leaf node.*/
    int height(Node node) {
        /* base case tree is empty */
        if (node == null)
            return 0;

        /* If tree is not empty then height = 1 + max of left
         height and right heights */
        return 1 + Math.max(height(node.left), height(node.right));
    }

    boolean isBST(Node n) {
        return isBSTUtil(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isBSTUtil(Node node, int min, int max) {
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right, node.data + 1, max));
    }

    //------------------------------------------------------

    public static void main(String[] args) throws NullPointerException {
        BinaryTrees tree1 = new BinaryTrees();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7,8};
        int n = arr.length;
        root = tree1.sortedArrayToBST(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed BST");

        tree1.preOrder(root);
        System.out.println("\n\n");

        //we have Node tree so want to print levels
        ListAtDepthBtree i = new ListAtDepthBtree();
        i.levelOrderQueue(root);

        BinaryTrees tree22 = new BinaryTrees();

        tree22.root = new Node(2);
        tree22.root.left = new Node(1);
        tree22.root.right = new Node(3);
        tree22.root.left.left = new Node(4);
        tree22.root.left.right = new Node(5);/*
        tree22.root.left.left.left = new Node(8);
*/
        System.out.println("\n Tree2 Balance state is, " + tree22.isBalanced(root));
        System.out.println("\n Tree1 Balance state is, " + tree1.isBalanced(root));
    }

}