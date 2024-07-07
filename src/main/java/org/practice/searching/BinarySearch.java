package org.practice.searching;

public class BinarySearch {
    static int binarySearch(int[] a, int l, int h, int key) {
        while (l <= h) {
            int mid = (l + h) / 2;

            if (a[mid] == key)
                return mid;
            if (a[mid] > key)
                h = mid - 1;
            if (key > mid)
                l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 98, 99, 100};
        int n = a.length;
        System.out.println(binarySearch(a, 0, n - 1, 99));
    }
}
