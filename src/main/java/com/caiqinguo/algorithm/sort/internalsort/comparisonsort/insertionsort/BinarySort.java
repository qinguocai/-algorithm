package com.caiqinguo.algorithm.sort.internalsort.comparisonsort.insertionsort;

/**
 * 二分插入排序
 *
 * 稳定性：
 *
 * 最坏时间复杂度：
 * 平均时间复杂度：
 * 最好时间复杂度：
 *
 * 空间复杂度：
 */
public class BinarySort {

    public static void sort(int[] arr) {
        int start = 0;
        int end = 0;
        int pos = 0;
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            start = 0;
            end = i - 1;
            pos = search(arr, start, end, arr[i]);
            temp = arr[i];
            for (int j = i; j > pos; j--) {
                arr[j] = arr[j - 1];
            }
            arr[pos] = temp;
        }
    }

    public static int search(int[] arr, int start, int end, int e) {
        int middle = 0;
        while (start <= end) {
            middle = start + (end - start) / 2;
            if (arr[middle] <= e) {
                start = middle + 1;
            }
            if (arr[middle] > e) {
                end = middle - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 3, 2, 5, 4, 7, 6, 9, 8};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
