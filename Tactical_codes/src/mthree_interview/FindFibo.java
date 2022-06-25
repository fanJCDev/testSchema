package mthree_interview;

public class FindFibo {
    /*
            Stream.iterate(new long[] { 1, 1 }, p -> new long[] { p[1], p[0] + p[1] })
                .limit(91)
                .skip(10)
                .findFirst().ifPresent(p -> System.out.println(p[0]));
     */
    public static int fibmemcomplex(int n) {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int fibdynamic(int n) {
        int f[] = new int[n + 1];
        int i;
        f[0] = 0;
        if (n > 0) {
            f[1] = 1;
            for (i = 2; i <= n; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
        }
        return f[n];
    }

    public static int fibrecursiv(int n) {
        if (n <= 1) {
            return n;
        }
        return fibrecursiv(n - 1) + fibrecursiv(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(fibmemcomplex(40));
    }
}
