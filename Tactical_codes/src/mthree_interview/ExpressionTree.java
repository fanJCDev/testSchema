package mthree_interview;

import java.util.Stack;

class Node {
    char data;
    Node left, right;

    public Node(char data) {
        this.data = data;
        left = right = null;
    }
}

public class ExpressionTree {
    public static boolean isOperator(char ch) {
        switch (ch) {
            case '/':
            case '*':
            case '-':
            case '+':
                return true;
            default:
                return false;
        }
    }

    public static Node chkExpre(String str) {
        Stack<Node> stk = new Stack<Node>();
        Node n1, n2, tmp;
        for (int i = 0; i < str.length(); i++) {
            if (!isOperator(str.charAt(i))) {
                tmp = new Node(str.charAt(i));
                stk.push(tmp);
            } else {
                tmp = new Node(str.charAt(i));
                n1 = stk.pop();
                n2 = stk.pop();
                tmp.left = n2;
                tmp.right = n1;
                stk.push(tmp);
            }
        }
        tmp = stk.pop();
        return tmp;
    }

    public static void print(Node root) {
        if (root == null) return;
        print(root.left);
        System.out.print(root.data);
        print(root.right);
    }

    public static void main(String[] args) {
        String post = "ABC*+D/";
        Node r = chkExpre(post);
        print(r);
    }
}
