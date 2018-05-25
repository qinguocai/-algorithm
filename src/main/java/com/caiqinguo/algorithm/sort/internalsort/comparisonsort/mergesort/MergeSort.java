package com.caiqinguo.algorithm.sort.internalsort.comparisonsort.mergesort;

import com.caiqinguo.algorithm.DivideAndConquer;

/**
 * 归并排序
 *
 * 稳定性：稳定
 *
 * 最坏时间复杂度：O(nlogn)
 * 平均时间复杂度：O(nlogn)
 * 最好时间复杂度：O(nlogn)
 *
 * 空间复杂度：O(n)
 */
public class MergeSort implements DivideAndConquer {

    public static void sort(int[] arr) {
        recursiveSort(arr, 0, arr.length - 1);
    }

    public static void recursiveSort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int middle = start + (end - start) / 2;
        recursiveSort(arr, start, middle);
        recursiveSort(arr, middle + 1, end);
        int[] tempArr = new int[end - start + 1];
        int p1 = start;
        int p2 = middle + 1;
        int p3 = 0;
        while ((p1 <= middle) && (p2 <= end)) {
            if (arr[p1] <= arr[p2]) {
                tempArr[p3++] = arr[p1++];
            } else {
                tempArr[p3++] = arr[p2++];
            }
        }
        while (p1 <= middle) {
            tempArr[p3++] = arr[p1++];
        }
        while (p2 <= end) {
            tempArr[p3++] = arr[p2++];
        }
        for (int i = 0; i < tempArr.length; i++) {
            arr[start + i] = tempArr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 3, 2, 5, 4, 7, 6, 9, 8};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
