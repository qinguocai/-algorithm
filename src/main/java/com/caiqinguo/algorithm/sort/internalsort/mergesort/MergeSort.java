package com.caiqinguo.algorithm.sort.internalsort.mergesort;

import com.caiqinguo.algorithm.thinking.DivideAndConquer;

/**
 * 归并排序
 * <p>
 * 稳定性：稳定
 * <p>
 * 最坏时间复杂度：O(nlogn)
 * 平均时间复杂度：O(nlogn)
 * 最好时间复杂度：O(nlogn)
 * <p>
 * 空间复杂度：O(n)
 */
public class MergeSort implements DivideAndConquer {

    public static void sortRecursively(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int middle = start + (end - start) / 2;
        sortRecursively(arr, start, middle);
        sortRecursively(arr, middle + 1, end);
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
        System.arraycopy(tempArr, 0, arr, start, tempArr.length);
    }

    public static void sortIteratively(int[] arr) {
        int[] result = new int[arr.length];
        for (int block = 1; block < arr.length; block *= 2) {
            for (int i = 0; i < arr.length; i += 2 * block) {
                int p = i;
                int p1 = i;
                int p2 = i + block;
                int end1 = i + block < arr.length ? i + block : arr.length;
                int end2 = i + 2 * block < arr.length ? i + 2 * block : arr.length;
                while ((p1 < end1) && (p2 < end2)) {
                    result[p++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
                }
                while (p1 < end1) {
                    result[p++] = arr[p1++];
                }
                while (p2 < end2) {
                    result[p++] = arr[p2++];
                }
            }
            int[] temp = result;
            result = arr;
            arr = temp;
        }
        result = null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 3, 2, 5, 4, 7, 8, 9, 6};
//        // 1. 递归
//        sortRecursively(arr, 0, arr.length - 1);
        // 2. 迭代
        sortIteratively(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
