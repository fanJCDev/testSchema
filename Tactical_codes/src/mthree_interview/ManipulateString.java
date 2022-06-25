package mthree_interview;

import java.util.Vector;

public class ManipulateString {
    public static String Manip(String str) {
        //List<Character> list=new List<Character>();

        Vector<Character> result = new Vector<Character>();

        //The 3nd rules follow the priority from left to right , so Loop to iterate over the characters of the string,
        for (int i = 0; i < str.length(); i++) {
            result.add(str.charAt(i));
            int n = result.size();

            // Check for Rule 1st If there are three consecutive characters, then it’unKnownProb a wrong spell.
            // Remove one of the characters. For Example string “ooops” can be changed to “oops”.
            if (n >= 3) {
                if (result.get(n - 1) == result.get(n - 2) && result.get(n - 1) == result.get(n - 3)) {
                    result.remove(result.size() - 1);
                }
            }
            n = result.size();
            //Check for Rule 2nd If two pairs of the same characters (AABB) are connected together, it’unKnownProb a wrong spell.
            // Delete one of the characters of the second pair. For Example string “i have.....” can be changed to “i have...”.
            if (n >= 4) {
                if (result.get(n - 1) == result.get(n - 2) && result.get(n - 3) == result.get(n - 4)) {
                    result.remove(result.size() - 1);
                }
            }
        }
        String last = "";
        for (Character c : result) last += c;
        return last;
    }

    public static void main(String[] args) {
        String str = "i have...";
        System.out.println(Manip(str));
    }
}
