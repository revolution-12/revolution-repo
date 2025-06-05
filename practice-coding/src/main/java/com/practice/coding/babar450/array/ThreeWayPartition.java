package com.practice.coding.babar450.array;

import java.util.Arrays;

public class ThreeWayPartition {

    public static void main(String[] args) {
        int[] num = {1, 4, 3, 6, 2, 1};
        int a = 2, b = 4;

        int i = 0, start = 0, end = num.length - 1;

        while (i <= end) {
            if (num[i] < a) {
                swap(num, i, start);
                start++;
                i++;
            } else if (num[i] > b) {
                swap(num, i, end);
                end--;
            } else {
                i++;
            }
        }

        Arrays.stream(num).forEach(n -> System.out.print(n + " "));

    }

    private static void swap(int[] num, int a, int b) {
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
}
