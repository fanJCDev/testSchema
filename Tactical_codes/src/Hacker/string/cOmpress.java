package Hacker.string;

public class cOmpress {
    public static void main(String[] args) {
        String a="aabbbccccabc   aabbbccccabc";
        System.out.println(compress(a));
    }

    //for prob4---how to compress string aabbbcccabc--> a2b3c3a1b1c1
    public static String compress(String str) {
        StringBuilder compressed= new StringBuilder();
        int countConsecutive = 0;
        for (int i= 0; i < str.length(); i++) {
            countConsecutive++;

            // If next character is different than current, append this char to result.
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        System.out.println(compressed.length()+"<--->"+str.length()+"<--->"+compressed.toString());
        return compressed.length() <= str.length() ? compressed.toString() : str;
    }
}
