package org.learn.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int counter = 0;
        int length = array.length;
        for (int s = 0; s < length - 1; s++) {
            for (int i = 0; i < length - s - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    counter++;
                }
            }
        }
        System.out.println(counter);
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

        BubbleSort.bubbleSort(data);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
