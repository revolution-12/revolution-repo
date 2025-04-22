package com.practice.coding.leetcode.array.beginner;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {

    public static void main(String[] args) {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = num[0], secondMax=Integer.MIN_VALUE;
        int i =0;
        while (i < num.length){
            if(num[i]>max){
                secondMax = max;
                max = num[i];
            }
          i++;
        }
        System.out.println(max + " "+secondMax);
    }
}
