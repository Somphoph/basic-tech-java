package org.learn.search;

public class BinarySearch {

    static int binarySearch(int[] arr, int l, int r, int find) {
        if (r >= l) {
            int mid = l + ((r - l) / 2);

            if (arr[mid] == find) {
                return mid;
            } else if (arr[mid] > find) {
                return binarySearch(arr, l, mid - 1, find);
            } else {
                return binarySearch(arr, mid + 1, r, find);
            }
        } else {
            return -1;
        }
    }

    static int search(int[] arr, int find) {
        return binarySearch(arr, 0, arr.length - 1, find);
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;

        int result = search(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}
