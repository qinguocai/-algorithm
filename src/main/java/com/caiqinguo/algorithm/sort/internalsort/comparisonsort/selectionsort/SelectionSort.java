package com.caiqinguo.algorithm.sort.internalsort.comparisonsort.selectionsort;

/**
 * 选择排序
 *
 * 稳定性：不稳定
 *
 * 最坏时间复杂度：O(n^2)
 * 平均时间复杂度：O(n^2)
 * 最好时间复杂度：O(n^2)
 *
 * 空间复杂度：O(1)
 */
public class SelectionSort {

    public static void sort(int[] arr) {
        if (arr == null) {
            return;
        }

        int minIdx = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
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
