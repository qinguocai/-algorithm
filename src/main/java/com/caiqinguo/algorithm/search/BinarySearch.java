package com.caiqinguo.algorithm.search;

/**
 * 二分查找
 *
 * 时间复杂度：O(logn)
 *
 * 空间复杂度：O(1)
 */
public class BinarySearch {

    public static int search(int[] arr, int e) {
        int start = 0;
        int end = arr.length - 1;
        int middle = 0;
        while (start <= end) {
            middle = start + (end - start) / 2;
            if (arr[middle] == e) {
                return middle;
            }
            if (arr[middle] < e) {
                start = middle + 1;
            }
            if (arr[middle] > e) {
                end = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(search(arr, 3));
    }
}
