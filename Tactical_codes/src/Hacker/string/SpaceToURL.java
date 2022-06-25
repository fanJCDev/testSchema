package Hacker.string;

public class SpaceToURL {
    public static void main(String[] args) {
        String str = "Node b c  ";
        System.out.println(str.length());

        // Creating array of string length
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println();

        replaceSpaces(ch,5);
    }

    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        index = trueLength + spaceCount * 2;
        char[] str1 = new char[index];
        if (trueLength < str.length) str[trueLength] = '\0';
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str1[index - 1] = '0';
                str1[index - 2] = '2';
                str1[index - 3] = '%';
                index = index - 3;
            } else {
                str1[index - 1] = str[i];
                index--;
            }
        }
        for (char c : str1) {
            System.out.print(c);
        }
    }
}
