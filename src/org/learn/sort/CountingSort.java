package org.learn.sort;

import java.util.Arrays;

public class CountingSort {
    public static void sort(int[] array) {
        int length = array.length;
        int[] outputs = new int[length];

        int[] count = new int[10];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
//        System.out.println(">>Count data");
        for (int i = 0; i < length; i++) {
            ++count[array[i]];
//            System.out.println("Count : " + Arrays.toString(count));
        }
//        System.out.println(">>Process count");
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
//            System.out.println("Count : " + Arrays.toString(count));
        }
//        System.out.println(">>Reorder to output");
//        System.out.println("Input : " + Arrays.toString(array));
        for (int i = length - 1; i >= 0; i--) {
            outputs[count[array[i]] - 1] = array[i];
            --count[array[i]];
//            System.out.println("Count : " + Arrays.toString(count));
//            System.out.println("Output : " + Arrays.toString(outputs));
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = outputs[i];
        }
    }

    public static void main(String args[]) {
        int[] data = {8, 7, 2, 1, 0, 9, 6, 8};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        sort(data);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
