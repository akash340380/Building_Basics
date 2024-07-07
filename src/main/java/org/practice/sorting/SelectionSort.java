package org.practice.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[]{33, 1, 8, 7, 34, 11};
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int min = a[i];
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    min = a[j];
                    idx = j;
                }

                int temp = a[i];
                a[i] = a[idx];
                a[idx] = temp;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
