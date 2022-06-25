package mthree_interview;

public class StringTonum {
    public static int stringToint(String str) {
        int indx = 0, number = 0;
        boolean siGn = false;
        int len = str.length();
        if (str.charAt(0) == '-') {
            siGn = true;
            indx = 1;
        }
        while (indx < len) {
            number *= 10;
            number += (str.charAt(indx) - '0');
            indx++;
        }
        if (siGn)
            number = -number;
        return number;
    }

    public static void main(String[] args) {
        String a = "1234567890";

        System.out.println(stringToint(a));
    }
}
