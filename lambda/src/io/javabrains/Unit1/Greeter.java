package io.javabrains.Unit1;

public class Greeter {
    public void greet(){
        System.out.print("Hello world..\n");
    }
    public void greet1(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting meeee = new Meeee();
        Greeting lam = () -> System.out.println("heloooooo in lambda\n");
        Greeting iner = new Greeting() {
            @Override
            public void perform() {
                System.out.println("anonymous inner class calling");
            }
        };
        //greeter.greet();
        //greeter.greet1(meeee);
        meeee.perform();
        lam.perform();
        //myFunc = () -> System.out.println("lambda hello world");s
        //int tringlen = (String s) -> s.length();

        Myadd addd = (int a , int b)->a+b;

    }
}
interface  MyLambda{
    void foo();
}
interface  Myadd{
    int addd(int a , int b);
}