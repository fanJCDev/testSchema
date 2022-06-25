package Hacker.string;

public class String_is_uniq {
    public static void main(String[] args) {
        String a="i love cadung";
        System.out.println(isUniqueChars(a));
    }
    public static boolean isUniqueChars(String str) {
        int checker= 0;
        for (int i= 0; i < str.length(); i++) {
            int val= str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                System.out.println("in place of "+i+" th the character "+str.charAt(i)+" is repeated");
                //System.out.println(checker+" -->  "+(checker & (1 << val)) );
                return false;
            }
            checker |= (1 << val);

            //System.out.println(checker+ " --> " +val+" --> "+str.charAt(i));
        }
        return true;
    }
}
