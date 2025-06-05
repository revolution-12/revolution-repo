package com.practice.coding.babar450.array;

import java.util.Arrays;

public class ChocolateDistribution {

    public static void main(String[] args) {
        int[] num = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;

        Arrays.sort(num);
        int i = 0;
        int j = m-1;
        int min = Integer.MAX_VALUE;
        while (j <= num.length-1){
            min = Math.min(min,num[j]-num[i]);
            i++;j++;
        }

        System.out.print(min);
    }
}
