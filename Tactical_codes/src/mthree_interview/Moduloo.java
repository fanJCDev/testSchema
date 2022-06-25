package mthree_interview;

public class Moduloo {
    public static int myDiv(int Divisor, int divided) {
        int sign = ((Divisor < 0) ^ (divided < 0)) ? -1 : 1;
        Divisor = Math.abs(Divisor);
        divided = Math.abs(divided);
        int quotient = 0;
        while (Divisor >= divided) {
            Divisor -= divided;
            ++quotient;
        }
        if (sign == -1) quotient = -quotient;
        return quotient;
    }

    public static int remi(int a, int b) {
        int cnt = 0;
        int q = myDiv(a, b);
        for (int i = 0; i < q; i++) cnt += b;
        return a - cnt;
    }

    public static void main(String[] args) {
        int a = 13;
        int b = 5;
        System.out.println("reminder " + a + "%" + b + " = " + remi(a, b));
    }
}
