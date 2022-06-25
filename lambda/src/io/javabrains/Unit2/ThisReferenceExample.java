package io.javabrains.Unit2;

public class ThisReferenceExample {
    public void doProcess(int i, Process p) {
        p.process(i);
    }
    public void execute(){
        doProcess(10, i -> {
            System.out.println("value of i is = " + i);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        /*
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("value of i is = " + i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "This is the anonymous inner class";
            }
        });
         */
        /*
        thisReferenceExample.doProcess(10, i -> {
            System.out.println("value of i is = " + i);
            System.out.println(this);//this will not work
        });
        */
        thisReferenceExample.execute();
    }
    public String toString() {
        return "This is the main This reference";
    }
}
