package org.learn.search;

public class JumpSearch {

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21,
                34, 55, 89, 144, 233, 377, 610, 659, 699};
        int x = 55;

        // Find the index of 'x' using Jump Search
        int index = search(arr, x);

        // Print the index where 'x' is located
        System.out.println("\nNumber " + x +
                " is at index " + index);
    }

    private static int search(int[] arr, int x) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));

        int current = step;
        int prev = 0;

        while (arr[Math.min(current, n) - 1] < x) {
            prev = current;
            current += step;

            if (prev >= n) return -1;
        }

        int i = prev;
        while (arr[++i] < x) {
            if (i == Math.min(current, n)) return -1;
        }

        if (arr[i] == x) {
            return i;
        }

        return -1;
    }
}
