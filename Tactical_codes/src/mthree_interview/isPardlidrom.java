package mthree_interview;

public class isPardlidrom {
    public static boolean is_palindrom(String str) {
        String tmp = str.replaceAll("\\s+", "").toLowerCase();

        int length = tmp.length();
        System.out.println(length);
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = tmp.charAt(forward++);
            char backwardChar = tmp.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    static void checker(String str) {
        if (is_palindrom(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean isPalind(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        return (str.equals(rev)) ? true : false;
    }


    public static void main(String[] args) {
        checker("aabaa");
        //checker("geeksogeeks");
        System.out.println(isPalind("aabtaa"));
    }
}
