
package mthree_interview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test {
    public static String TogEach(String str) {
        String[] words = str.split("\\s");
        StringBuilder tmp = new StringBuilder("");
        for (String t : words) {
            StringBuilder s = new StringBuilder(t);
            String s1 = s.substring(0, 1).toLowerCase();
            String s2 = s.substring(1).toUpperCase();
            tmp.append(s1).append(s2).append(" ");
        }
        return tmp.toString();
    }

    public static String Revrs(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String RevEach(String str) {
        String words[] = str.split("\\s");
        StringBuilder s2 = new StringBuilder("");
        for (String s : words) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            s2.append(sb).append(" ");
        }
        return s2.toString();
    }

    public int s(int x) {
        return x * x;
    }


    public static void main(String args[]) {
        List<String> d = new ArrayList<String>(Arrays.asList("a", "b"));
        for (String v : d) {
            if (v.equals("a")) {
                d.remove(v);
            }
        }
        System.out.println(d);
    }
}
/*
*
    // main method
* */