package BGcommonicator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagTst {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("<([^>]+)>([^<>]+)</\\1>");
        Scanner in = new Scanner(System.in);
        int NumberofElements = Integer.parseInt(in.nextLine());
        while (NumberofElements > 0) {
            String Element = in.nextLine();
            Matcher matcher = pattern.matcher(Element);
            boolean matchFound = true;
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = false;
            }
            if (matchFound) {
                System.out.println("None");
            }
            NumberofElements--;
        }
    }
}
