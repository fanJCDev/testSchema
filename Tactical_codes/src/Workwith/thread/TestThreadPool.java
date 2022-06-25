package thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//**********************************************
class Tasks implements Runnable {
    private String taskName;

    // constructor of the class Tasks
    public Tasks(String str) {
// initializing the field taskName
        taskName = str;
    }

    // Printing the task name and then sleeps for 1 sec
// The complete process is getting repeated five times
    public void run() {
        try {
            for (int j = 0; j <= 5; j++) {
                if (j == 0) {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

//prints the initialization time for every task
                    System.out.println("Initialization time for the task name: " + taskName + " = " + sdf.format(dt));

                } else {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

// prints the execution time for every task
                    System.out.println("Time of execution for the task name: " + taskName + " = " + sdf.format(dt));

                }

// 1000ms = 1 sec
                Thread.sleep(1000);
            }

            System.out.println(taskName + " is complete.");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

//**********************************************
class WorkerThread implements Runnable {
    private String message;

    public WorkerThread(String s) {
        this.message = s;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processmessage();//call processmessage method that sleeps the thread for 2 seconds
        System.out.println(Thread.currentThread().getName() + " (End)");//prints thread name
    }

    private void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TestThreadPool {
    static final int MAX_TH = 5;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);//calling execute method of ExecutorService
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("Finished all threads");
        System.out.println("**********************************************************************");
        Runnable rb1 = new Tasks("task 1");
        Runnable rb2 = new Tasks("task 2");
        Runnable rb3 = new Tasks("task 3");
        Runnable rb4 = new Tasks("task 4");
        Runnable rb5 = new Tasks("task 5");

// creating a thread pool with MAX_TH number of
// threads size the pool size is fixed
        ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);

// passes the Task objects to the pool to execute (Step 3)
        pl.execute(rb1);
        pl.execute(rb2);
        pl.execute(rb3);
        pl.execute(rb4);
        pl.execute(rb5);
        System.out.println("**********************************************************************");


// pool is shutdown
        pl.shutdown();
    }
}
