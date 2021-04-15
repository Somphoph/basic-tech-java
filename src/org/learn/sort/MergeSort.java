package org.learn.sort;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] array) {
        int length = array.length;
        sort(array, 0, length - 1);
    }

    public static void sort(int[] array, int left, int right) {
        if (left < right) {
            int mid = ((right - left + 1) / 2) + left - 1;

            sort(array, left, mid);
            sort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int leftLen = mid - left + 1;
        int rightLen = right - mid;
        int[] arrayLeft = new int[leftLen];
        int[] arrayRight = new int[rightLen];
        /* Copy data to subarray */
        for (int i = 0; i < leftLen; i++) {
            arrayLeft[i] = array[i + left];
        }
        for (int j = 0; j < rightLen; j++) {
            arrayRight[j] = array[mid + 1 + j];
        }

        int iLeft = 0;
        int iRight = 0;
        int iMain = left;

        while (iLeft < leftLen && iRight < rightLen) {
            if (arrayLeft[iLeft] < arrayRight[iRight]) {
                array[iMain] = arrayLeft[iLeft];
                iLeft++;
            } else {
                array[iMain] = arrayRight[iRight];
                iRight++;
            }
            iMain++;
        }

        while (iLeft < leftLen) {
            array[iMain] = arrayLeft[iLeft];
            iLeft++;
            iMain++;
        }

        while (iRight < rightLen) {
            array[iMain] = arrayRight[iRight];
            iRight++;
            iMain++;
        }
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }

    public static void main(String[] args) {
        int[] data = {8, 7, 2, 1, 0, 9, 6, 8};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int size = data.length;
        sort(data);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
