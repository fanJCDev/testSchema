package Hacker.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
    static void showpush(Stack st, int a) {
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack_problem.dog_cat_in_stack: " + st);
    }


    static void showpop(Stack st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack_problem.dog_cat_in_stack: " + st);
    }


    public static void main(String args[]) {
        Stack st = new Stack();
        System.out.println("stack_problem.dog_cat_in_stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack_problem.dog_cat_in_stack");
        }
    }
}
