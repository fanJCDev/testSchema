package Hacker.interefasac.Shape;
public class Cube extends Square implements IShape {
    public Cube() {
        super();
    }
    public Cube(int s) {
        super(s);
    }
    public int perimeter() {
        return -1; //to mean that perimeter is not defined for Cube
    }
    public int area() {
        return 6 * s * s;
    }
    public int volume() {
        return s * s * s;
    }
}
