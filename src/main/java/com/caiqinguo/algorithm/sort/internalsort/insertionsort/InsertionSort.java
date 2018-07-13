package com.caiqinguo.algorithm.sort.internalsort.insertionsort;

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
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i; (j > 0) && (temp < arr[j - 1]); j--) {
                arr[j] = arr[j - 1];
            }
            if (j != i) {
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 3, 2, 5, 4, 5, 7, 6, 5, 9, 5, 8};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
