package mthree_interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Compres {
    public static String compresString(String text) {
        char[] c1 = text.toCharArray();
        Arrays.sort(c1);//o(nlogn)
        //text = String.valueOf(c1);
        text = new String(c1);

        int length = text.length();
        if (length > 2) {
            String compressedText = "";
            char lastChar = text.charAt(0);
            int charCount = 1;
            for (int i = 1; i < length; i++) {
                if (text.charAt(i) == lastChar) charCount++;
                else {
                    compressedText += Character.toString(lastChar) + Integer.toString(charCount);
                    lastChar = text.charAt(i);
                    charCount = 1;
                }
            }
            compressedText += Character.toString(lastChar) + Integer.toString(charCount);
            if (compressedText.length() < length)
                return compressedText;
        }

        return text;
    }

    static String compress(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            char[] c1 = str.toCharArray();
            Arrays.sort(c1);//o(nlogn)
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            int i, j, count;
            for (i = 0; i < c1.length; ) {
                count = 1;
                for (j = i + 1; j < c1.length; j++) {
                    if (c1[i] == c1[j]) {
                        count++;
                    }
                }
                map.put(c1[i], count);
                i = count + i;
            }
            String temp = "";

            for (Map.Entry<Character, Integer> entry : map.entrySet())
                temp += entry.getKey() + "" + (entry.getValue() == 1 ? "" : entry.getValue().toString());
            return temp;
        }

    }

    public static void main(String[] args) {
        String str = "abbbcccccdefgh";
        System.out.println("\n" + str + " = " + compress(str));
        //System.out.println("\n"+str+" = "+compresString(str));
    }
}
