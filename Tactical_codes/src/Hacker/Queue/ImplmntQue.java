package Hacker.Queue;

public class ImplmntQue {
    private int[] arr;  	// array to store queue_problem.best_queue elements
    private int front;  	// front points to the front element in the queue_problem.best_queue
    private int rear;   	// rear points to the last element in the queue_problem.best_queue
    private int capacity;   // maximum capacity of the queue_problem.best_queue
    private int count;  	// current size of the queue_problem.best_queue
    // Constructor to initialize Node queue_problem.best_queue
    ImplmntQue(int size){
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
    // Utility function to dequeue the front element
    public void dequeue(){
        // check for queue_problem.best_queue underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Removing " + arr[front]);

        front = (front + 1) % capacity;
        count--;
    }
    // Utility function to add an item to the queue_problem.best_queue
    public void enqueue(int item) {
        // check for queue_problem.best_queue overflow
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }
    // Utility function to return the front element of the queue_problem.best_queue
    public int peek() {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        return arr[front];
    }
    // Utility function to return the size of the queue_problem.best_queue
    public int size() {
        return count;
    }
    // Utility function to check if the queue_problem.best_queue is empty or not
    public Boolean isEmpty() {
        return (size() == 0);
    }
    // Utility function to check if the queue_problem.best_queue is full or not
    public Boolean isFull() {
        return (size() == capacity);
    }
    public static void main (String[] args) {
        // create Node queue_problem.best_queue of capacity 5
        ImplmntQue q = new ImplmntQue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("The front element is " + q.peek());
        q.dequeue();
        System.out.println("The front element is " + q.peek());

        System.out.println("The queue_problem.best_queue size is " + q.size());

        q.dequeue();
        q.dequeue();

        if (q.isEmpty()) {
            System.out.println("The queue_problem.best_queue is empty");
        }
        else {
            System.out.println("The queue_problem.best_queue is not empty");
        }
    }
}
