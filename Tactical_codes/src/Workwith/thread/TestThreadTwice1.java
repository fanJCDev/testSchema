package thread;

public class TestThreadTwice1 extends Thread {
    public void run() {
        System.out.println("running...");
    }

    public static void main(String args[]) {
        TestThreadTwice1 t1 = new TestThreadTwice1();
        TestThreadTwice1 t2 = new TestThreadTwice1();
        t1.start();
        //t1.start();
        t2.run();
        t2.start();
    }
}
