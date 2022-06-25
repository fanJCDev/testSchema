package Workwith.Toronto_interview;

import java.util.Arrays;
import java.util.Comparator;

public class SortL {

    public static String[][] Spliters(String[] str){
        System.out.println(Arrays.deepToString(str));
        System.out.println(str.length);
        String[][] r= new String[str.length][2];

        for(int i=0;i<10;i++){
            String[] tmp=str[i].split(" ");
            r[i][0]=tmp[tmp.length-2];
            r[i][1]=tmp[tmp.length-1];
        }

        System.out.println(Arrays.deepToString(r));
        return r;
    }
    public static void print(String[][] data){
        System.out.println(Arrays.deepToString(data
        ));
    }

    public static void main(String[] args) {
        String[] w={"Bill Moon","Janet Mooon","George Bailey","Ellan Irmotti","Tom Nguyen","William Walters","Author James","Henry Daniels","Mike Franklin","Julie Andrews"};
        String[][] e =new String[w.length][];
        e=Spliters(w);
        Arrays.sort(e, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String field1 = entry1[0];
                final String field2 = entry2[0];
                return field1.compareTo(field2);}});
        print(e);
        System.out.println();
        Arrays.sort(e, new SortByFn());
        print(e);
        System.out.println();
        Arrays.sort(e, new SortByLn());
        print(e);
        Arrays.sort(e, new SortByNofI());
        print(e);
    }
}

class SortByLn implements Comparator<String[]> {
    @Override
    public int compare(final String[] entry1, final String[] entry2) {
        final String field1 = entry1[1];
        final String field2 = entry2[1];
        return field1.compareTo(field2);
    }
}

class SortByFn implements Comparator<String[]>{
    @Override
    public int compare(final String[] entry1, final String[] entry2) {
        final String field1 = entry1[0];
        final String field2 = entry2[0];
        return field1.compareTo(field2);
    }
}

class SortByNofI implements Comparator<String[]> {
    public static int findMaxChar(String str) {
        char[] array = str.toCharArray();
        int maxCount = 1;
        char maxChar = array[0];
        for (int i = 0, j = 0; i < str.length() - 1; i = j) {
            int count = 1;
            while (++j < str.length() && array[i] == array[j]) {
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = array[i];
            }
        }
        return maxCount;
    }

    @Override
    public int compare(final String[] entry1, final String[] entry2) {
        final String field1 = entry1[0];
        final String field2 = entry2[0];
        final String field3 = entry1[1];
        final String field4 = entry2[1];
        if (findMaxChar(field3) == (findMaxChar(field4))) {
            return findMaxChar(field1) - findMaxChar(field2);
        } else {
            return findMaxChar(field3) - findMaxChar(field4);
        }
    }
}