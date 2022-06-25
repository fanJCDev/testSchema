package Hacker.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Linklst {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.add("A");     // Insert `A` into the queue_problem.best_queue
        queue.add("B");     // Insert `B` into the queue_problem.best_queue
        queue.add("C");     // Insert `C` into the queue_problem.best_queue
        queue.add("D");     // Insert `D` into the queue_problem.best_queue

        // Prints the front of the queue_problem.best_queue (`A`)
        System.out.println("The front element is " + queue.peek());

        queue.remove();     // removing the front element (`A`)
        queue.remove();     // removing the front element (`B`)

        // Prints the front of the queue_problem.best_queue (`C`)
        System.out.println("The front element is " + queue.peek());

        // Returns the total number of elements present in the queue_problem.best_queue
        System.out.println("The queue_problem.best_queue size is " + queue.size());

        // check if the queue_problem.best_queue is empty
        if (queue.isEmpty()) {
            System.out.println("The queue_problem.best_queue is empty");
        } else {
            System.out.println("The queue_problem.best_queue is not empty");
        }

    }
}
