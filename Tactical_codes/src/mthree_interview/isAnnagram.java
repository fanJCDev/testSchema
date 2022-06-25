package mthree_interview;

import java.util.Arrays;

public class isAnnagram {
    public static boolean isAnagramSort(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        String s1 = "cat", s2 = "tac";
        if (isAnagramSort(s1, s2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
