package org.learn.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int hold = i;
            while (hold > 0 && (array[hold] < array[hold - 1])) {
                swap(array, hold - 1, hold);
                hold = hold - 1;
                System.out.println(Arrays.toString(array));
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
        sort(data);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
