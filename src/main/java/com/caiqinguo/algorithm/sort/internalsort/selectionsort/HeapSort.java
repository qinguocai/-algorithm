package com.caiqinguo.algorithm.sort.internalsort.selectionsort;

/**
 * 堆排序
 * <p>
 * 稳定性：
 * <p>
 * 最坏时间复杂度：
 * 平均时间复杂度：
 * 最好时间复杂度：
 * <p>
 * 空间复杂度：
 */
public class HeapSort {

    public static void sort(int[] arr) {
        for (int i = (arr.length - 2) >> 2; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }

    public static void heapify(int[] arr, int i, int len) {
        int leftIndex = i * 2;
        if (leftIndex >= len) {
            return;
        }
        int maxIndex = leftIndex;
        int rightIndex = leftIndex + 1;
        if ((rightIndex < len) && (arr[rightIndex] > arr[leftIndex])) {
            maxIndex = rightIndex;
        }
        if (arr[i] < arr[maxIndex]) {
            swap(arr, i, maxIndex);
            heapify(arr, maxIndex, len);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 3, 2, 5, 4, 7, 6, 9, 8};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
