package mthree_interview;

public class isDuoDigit {
    public static String isDuoDigit(int number) {
        /* Write your code here */
        /*boolean isDuoDigit = Integer.toString(number).replace("-", "").chars().distinct().count() <= 2;
        return isDuoDigit ? "y" : "n";*/
        boolean isDuoDigit = Integer.toString(Math.abs(number)).chars().distinct().count() <= 2;
        return isDuoDigit ? "y" : "n";
    }

    public static void main(String[] args) {
        System.out.println(isDuoDigit.isDuoDigit(12));
        System.out.println(isDuoDigit.isDuoDigit(110));
        System.out.println(isDuoDigit.isDuoDigit(102));
        System.out.println(isDuoDigit.isDuoDigit(-2021));
    }
}
