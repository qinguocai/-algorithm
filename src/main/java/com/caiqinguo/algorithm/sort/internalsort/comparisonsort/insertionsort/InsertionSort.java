package com.caiqinguo.algorithm.sort.internalsort.comparisonsort.insertionsort;

/**
 * 插入排序
 *
 * 稳定性：稳定
 *
 * 最坏时间复杂度：O(n^2)
 * 平均时间复杂度：O(n^2)
 * 最好时间复杂度：O(n)
 *
 * 空间复杂度：O(1)
 */
public class InsertionSort {

    public static void sort(int[] arr) {
        if (arr == null) {
            return;
        }

        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] >= arr[j - 1]) {
                    break;
                }
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
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
