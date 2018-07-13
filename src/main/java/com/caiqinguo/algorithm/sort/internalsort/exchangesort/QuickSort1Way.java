package com.caiqinguo.algorithm.sort.internalsort.exchangesort;

import com.caiqinguo.algorithm.thinking.DivideAndConquer;

/**
 * 快速排序
 *
 * 稳定性：不稳定
 *
 * 最坏时间复杂度：
 * 平均时间复杂度：
 * 最好时间复杂度：
 *
 * 空间复杂度：O(logn)
 */
public class QuickSort1Way implements DivideAndConquer {

    public static void sortRecursively(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int l = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < arr[start]) {
                int temp = arr[++l];
                arr[l] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[start];
        arr[start] = arr[l];
        arr[l] = temp;
        sortRecursively(arr, start, l - 1);
        sortRecursively(arr, l + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 5, 3, 2, 5, 4, 7, 6, 5, 9, 8};
        sortRecursively(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
