package mthree_interview;

import java.util.HashMap;

public class UniqueElements {
    public static void distnct(int[] arr) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int j = 0; j < arr.length; j++) {
            hashmap.put(arr[j], j);
        }
        System.out.println(hashmap.keySet());//o-1

    }

    public static void main(String[] args) {
        int a[] = {10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6};
        distnct(a);
    }
}
