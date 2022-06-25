package Hacker.stack;

class Implmnt_Stack
{
    private int arr[];
    private int top;
    private int capacity;
    // Constructor to initialize the stack
    Implmnt_Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    // Utility function to add an element `x` to the stack
    public void push(int x){
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
    // Utility function to pop Node top element from the stack
    public int pop(){
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Removing " + peek());

        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }
    // Utility function to return the top element of the stack
    public int peek(){
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(1);
        }

        return -1;
    }
    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }
    // Utility function to check if the stack is empty or not
    public Boolean isEmpty()
    {
        return top == -1;               // or return size() == 0;
    }
    // Utility function to check if the stack is full or not
    public Boolean isFull() {
        return top == capacity - 1;     // or return size() == capacity;
    }
    public static void main(String[] args) {
        // create Node stack_problem.best_stack of capacity 5
        Implmnt_Stack stck = new Implmnt_Stack(3);
        stck.push(1);      // inserting 1 in the implmntStack
        stck.push(2);      // inserting 2 in the implmntStack
        stck.pop();        // removing the top element (2)
        stck.pop();        // removing the top element (1)
        stck.push(3);      // inserting 3 in the implmntStack
        System.out.println("The top element is " + stck.peek());
        System.out.println("The implmntStack size is " + stck.size());
        stck.pop();        // removing the top element (3)
        // check if the implmntStack is empty
        if (stck.isEmpty()){
            System.out.println("The implmntStack is empty");
        } else {
            System.out.println("The implmntStack is not empty");
        }
    }
}
