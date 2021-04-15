package org.learn.sort;

import java.util.Arrays;

public class HeapSort {
    public static void sort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            swap(array, i, 0);
            heapify(array, i, 0);
        }
    }

    static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;

        if (left < n && array[left] > array[i]) {
            largest = left;
        }
        if (right < n && array[right] > array[i] && array[right] > array[left]) {
            largest = right;
        }
        if (largest != i) {
            swap(array, i, largest);
            heapify(array, n, largest);
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

        HeapSort.sort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
