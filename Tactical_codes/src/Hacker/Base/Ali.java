package Hacker.Base;

public class Ali {
    public static int convertToBase(String number, int base) {
        if (base < 2 ||  (base > 10 && base != 16)) return -1;
        int value = 0;
        for (int i= number.length() - 1; i >= 0; i--) {
            int digit= digitToValue(number.charAt(i));
            if (digit < 0 || digit >= base) {
                return -1;
            }
            int exp= number.length() - 1 - i;
            value += digit * Math.pow(base, exp);
        }
        return value;
    }

    public static int digitToValue(char charAt) {
        return charAt-'0';
    }
    public static void main(String[] args) {
        System.out.println(convertToBase("1010",2));
    }
}
