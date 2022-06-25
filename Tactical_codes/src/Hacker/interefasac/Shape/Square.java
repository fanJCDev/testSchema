package Hacker.interefasac.Shape;
import java.util.ArrayList;
import java.util.List;
public class Square implements IShape {
    protected int s;
    public Square() {
        this.s = 0;
    }
    public Square(int s) {
        setSide(s);
    }
    int getSide() {
        return s;
    }
    void setSide(int s) {
        if (s >= 0) {
            this.s = s;
        } else {
            this.s = 0;
        }
    }
    public int perimeter() {
        return 4 * s;
    }
    public int area() {
        return s * s;
    }
    public int volume() {
        return 0;
    }
    public List<Integer> listSides() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(this.s);
        return l;
    }
}
