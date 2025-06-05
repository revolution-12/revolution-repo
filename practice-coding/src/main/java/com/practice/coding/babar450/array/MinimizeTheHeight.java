package com.practice.coding.babar450.array;

import java.util.Arrays;

public class MinimizeTheHeight {

    public static void main(String[] args) {
        int k = 2;
        int[] arr = {2, 3, 4, 6};
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            int max = maximum(largest, arr[i] + k);
            int min = minimum(smallest, arr[i + 1] - k);
            if (min < 0) continue;
            int currDiff = max - min;

            ans = minimum(ans, currDiff);
        }
    }

    private static int maximum(int a, int b) {
        if (a > b) return a;
        if (b > a) return b;
        return a;
    }

    private static int minimum(int a, int b) {
        if (a < b) return a;
        if (b < a) return b;
        return a;
    }
}
