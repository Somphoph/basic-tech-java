package org.learn.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            if (i != min) {
                swap(array, i, min);
            }
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
        SelectionSort.sort(data);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
