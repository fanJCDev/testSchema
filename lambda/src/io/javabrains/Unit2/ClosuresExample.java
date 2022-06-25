package io.javabrains.Unit2;

public class ClosuresExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;//in java 8 hast ke be ma etemad mikoneh in ye joori froozen shodeh
        //final int b =20;//2--in bara java 7 bood bara rafe moshkele payeen 1--
        /*
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                //b=40;//1--local variable b defined in an enclosing scope must be foinal or effectively final
                //2--;
                System.out.println(i + b);
            }
        });
        */
        doProcess(a, i -> System.out.println(i + b));//inja runtime value of b roo freez kardeh
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
