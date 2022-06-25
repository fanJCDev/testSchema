package mthree_interview;

import java.util.Arrays;

public class Quicksrt {//O(n logn)

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int piv = partition(arr, low, high);
            quickSort(arr, low, piv - 1);
            quickSort(arr, piv + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
