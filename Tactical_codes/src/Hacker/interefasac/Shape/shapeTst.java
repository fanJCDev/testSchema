package Hacker.interefasac.Shape;

public class shapeTst {
    public static void main(String[] args) {
        Cube c = new Cube(4);
        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(c.volume());
        System.out.println(c.getSide());

        Square s = new Cube(4);
        System.out.println(s.area());

        Square s1 = new Square(4);
        System.out.println(s.area());
    }
}
