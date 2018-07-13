package com.caiqinguo.algorithm.sort.internalsort.exchangesort;

/**
 * 三路快排
 */
public class QuickSort3Ways {

    public static void sortRecursively(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int i = start + 1;
        int j = end;
        int k = i;
        while (k <= j) {
            if (arr[k] < arr[start]) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                i++;
                k++;
            } else if (arr[k] > arr[start]) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                j--;
            } else {
                k++;
            }
        }
        int temp = arr[start];
        arr[start] = arr[i - 1];
        arr[i - 1] = temp;
        sortRecursively(arr, start, i - 1);
        sortRecursively(arr, j + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 3, 2, 5, 4, 5, 7, 6, 5, 9, 8, 5};
        sortRecursively(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
