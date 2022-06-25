package mthree_interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversArry {
    public static void Reverse1(int... arr) {
        Integer[] what = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List list = Arrays.asList(what);
        Collections.reverse(list);
        System.out.println(list.toString());
    }

    public static void Reverse2(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        //Reverse2(arr);
        Reverse1(arr);
    }
}
