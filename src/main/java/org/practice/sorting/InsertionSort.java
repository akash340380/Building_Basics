package org.practice.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{33, 1, 8, 7, 34, 11};
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int j = i - 1;
            while (j > -1 && a[i] < a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i--;
                j--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
