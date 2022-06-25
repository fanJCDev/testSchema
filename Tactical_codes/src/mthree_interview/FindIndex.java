package mthree_interview;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIndex {
    public static int indexFinderwithBinarysearch(int[] arr, int key) {
        //Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, key);//ologn must be sorted
        return (index < 0) ? -1 : index;
    }

    public static int indexFinderwithArraylist(int[] arr, int key) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);
        return list.indexOf(key);
    }

    public static void main(String[] args) {
        int[] my_array1 = new int[]{5, 4, 6, 1, 3, 2, 7, 8, 9};
        int[] my_array2 = new int[]{2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(indexFinderwithBinarysearch(my_array1, 2));
        System.out.println(indexFinderwithArraylist(my_array1, 2));

        System.out.println(indexFinderwithBinarysearch(my_array2, 7));
        System.out.println(indexFinderwithArraylist(my_array2, 7));

    }
}
