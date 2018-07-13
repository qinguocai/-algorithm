package com.caiqinguo.algorithm.sort.internalsort.exchangesort;

/**
 * 双路快排
 */
public class QuickSort2Ways {

    public static void sortRecursively(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int i = start + 1;
        int j = end;
        while (i <= j) {
            while ((i <= j) && (arr[i] < arr[start])) {
                i++;
            }
            while ((i <= j) && (arr[j] > arr[start])) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        int temp = arr[start];
        arr[start] = arr[j];
        arr[j] = temp;
        sortRecursively(arr, start, j - 1);
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
