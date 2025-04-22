package com.practice.coding.leetcode.array.beginner;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountEvenOdds {

    public static void main(String[] args) {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};


        long even = Arrays.stream(num).filter(n -> n % 2 == 0).count();
        long odd = Arrays.stream(num).filter(n -> n % 2 != 0).count();
        System.out.println("even " + even + " odd " + odd);

    }
}
