package Hacker.interefasac;

public class StaticTst {
    static int s;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StaticTst p = new StaticTst();
        p.start();
        System.out.println(s);
    }
    void start() {
        int x = 7;
        twice(x);
        System.out.print(x + " ");
    }
    void twice(int x) {
        x = x * 2;
        s = x;
    }
}
