package com.practice.coding.babar450.array;

public class MinAndMaxOfArray {

    public static void main(String[] args) {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int min = 0, max = 0;

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] < min) {
                min = num[i];
            } else if (num[i] > max) {
                max = num[i];
            }
        }


        System.out.print(min + " " + max);

    }
}
