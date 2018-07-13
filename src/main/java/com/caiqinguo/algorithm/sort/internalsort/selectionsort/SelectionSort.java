package com.caiqinguo.algorithm.sort.internalsort.selectionsort;

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
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
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
