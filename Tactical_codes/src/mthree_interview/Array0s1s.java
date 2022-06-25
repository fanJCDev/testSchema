package mthree_interview;

import java.util.Arrays;

public class Array0s1s {
    public static void convertArr(int arr[]) {
        System.out.println(Arrays.toString(arr));
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) cnt++;
        }
        for (int i = 0; i < cnt; i++) arr[i] = 0;
        for (int i = cnt; i < arr.length; i++) arr[i] = 1;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 0, 1, 1, 1};
        convertArr(arr);
    }
}
