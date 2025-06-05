package com.practice.coding.babar450.array;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 10};
        int[] arr2 = {1, 2, 6, 8, 12};
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k =0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < arr1.length) {
            arr3[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length) {
            arr3[k] = arr2[j];
            k++;
            j++;
        }

        Arrays.stream(arr3).forEach(n -> System.out.print(n + " , "));
    }
}
