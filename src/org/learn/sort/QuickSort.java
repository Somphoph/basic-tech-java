package org.learn.sort;

import java.util.Arrays;

public class QuickSort {

    // method to find the partition position
    static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int iheight = low;
        int ilow;

        for (ilow = low; ilow <= high - 1; ilow++) {
            if (array[ilow] < pivot) {
                swap(array, iheight, ilow);
                iheight++;
            }
        }
        int mid = iheight;
        swap(array, high, mid);
        return mid;
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] data = {8, 7, 2, 1, 0, 9, 6, 8};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int size = data.length;

        // call quicksort() on array data
        QuickSort.quickSort(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }

}
