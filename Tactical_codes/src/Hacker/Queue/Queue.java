package Hacker.Queue;

import java.util.ArrayList;

public class Queue<E>{
    private ArrayList<E> queue;
    public Queue(){
        this.queue = new ArrayList<E>();
    }
    public void Enqueue(E object){
        queue.add(object);
    }
    public E Dequeue(){
        if (size() > 0) {
            return queue.remove(0);
        }
        return null;
    }
    public int size(){
        return queue.size();
    }
    public void print(){
        for (E item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();
        queue.Enqueue("jack");
        queue.Enqueue("mike");
        //queue_problem.best_queue.Dequeue();
        queue.Enqueue("adam");
        //System.out.println(queue_problem.best_queue.Dequeue());
        System.out.println(queue.size());
        queue.print();
    }
}
