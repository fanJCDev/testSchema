package mthree_interview;

public class JoinArrayElement {
    public static String Jon(String[] str) throws NullPointerException {
        //return String.join("", str);//java8
        //List<String> list = Arrays.asList(str);
        //return String.join(",", list);

        StringBuilder sbStr = new StringBuilder();
        for (String element : str) {

            sbStr.append(element);
        }
        return sbStr.toString();
    }

    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c", null, "SevenSegmentDisplay"};
        System.out.println(Jon(array));
    }
}
