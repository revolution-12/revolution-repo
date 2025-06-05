package com.practice.coding.babar450.array;

import java.util.Arrays;

public class RearrangeNumbersBySign {

    public static void main(String[] args) {
        int[] num = {1, 2, -3, 5, 4, -44, -12};


        //rightRotate(num, 0, num.length - 1);
        Arrays.stream(num).forEach(n -> System.out.print(n + " "));
    }

    private static void rightRotate(int[] num, int start, int end) {
        int temp = num[end];
        for (int i = end; i > start; i--) {
            num[i] = num[i - 1];
        }
        num[start] = temp;
    }
}
