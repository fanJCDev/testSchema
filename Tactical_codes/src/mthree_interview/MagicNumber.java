package mthree_interview;

public class MagicNumber {
    public static boolean isMagic(int num) {
        return (((num - 1) % 9) == 0) ? true : false;
    }

    public static void isMagic1(int num) {
        int sum = 0, r = 1, tmp;
        tmp = num;
        while (num > 9) {
            while (num > 0) {
                r = num % 10;
                sum = sum + r;
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1) {
            System.out.println("The given number is a magic number.");
        } else {
            System.out.println("The given number is not a magic number.");
        }
    }

    public static void main(String[] args) {
        int a = 28;
        if (isMagic(a)) {
            System.out.println("The given number is a magic number.");
        } else {
            System.out.println("The given number is not a magic number.");
        }
        isMagic1(a);
    }
}
