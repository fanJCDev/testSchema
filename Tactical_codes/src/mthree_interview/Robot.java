package mthree_interview;

public class Robot {
    public static void Position(String mov) {
        int l = mov.length();
        int gUp = 0, gDown = 0, gLeft = 0, gRight = 0;
        mov = mov.toUpperCase();
        for (int i = 0; i < l; i++) {
            if (mov.charAt(i) == 'S')
                gUp++;
            if (mov.charAt(i) == 'L')
                gLeft++;
            if (mov.charAt(i) == 'R')
                gRight++;
        }
        System.out.println("Final Position: (" + (gRight - gLeft) + ", " + gUp + ")");//+ (gUp - gDown) + ")");
    }

    public static void main(String[] args) {
        String move = "sssllllllllrrrrrrrrrrrrrslr";
        Position(move);
    }
}
