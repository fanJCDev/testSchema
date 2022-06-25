package thread;

public class OddEvenExample {
    int contr = 1;
    static int NUM;

    // Method for printing the odd numbers
    public void displayOddNumber() {
// note that synchronized blocks are necessary for the code for getting the desired
// output. If we remove the synchronized blocks, we will get an exception.
        synchronized (this) {
            while (contr < NUM) {
// If the contr is even then display
                while (contr % 2 == 0) {
// handling the exception handle
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
// Printing the number
                System.out.print(contr + " ");

// Incrementing the contr
                contr = contr + 1;
// notifying the thread which is waiting for this lock
                notify();
            }
        }
    }

    // Method for printing the even numbers
    public void displayEvenNumber() {
        synchronized (this) {
// Printing the number till NUM
            while (contr < NUM) {
// If the count is odd then display
                while (contr % 2 == 1) {
// handling the exception
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
// Printing the number
                System.out.print(contr + " ");
// Incrementing the contr
                contr = contr + 1;
// Notifying to the 2nd thread
                notify();
            }
        }
    }

    public static void main(String[] args) {
        NUM = 20;
// creating an object of the class OddEvenExample
        OddEvenExample oe = new OddEvenExample();
        Thread th1 = new Thread(new Runnable() {

            public void run() {
// invoking the method displayEvenNumber() using the thread th1
                oe.displayEvenNumber();
            }
        });
        Thread th2 = new Thread(new Runnable() {

            public void run() {
// invoking the method displayEvenNumber() using the thread th1
                oe.displayOddNumber();
            }
        });
        th1.start();
        th2.start();

    }

}
