package com.practice.coding.babar450.array;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] num = {4, 2, -3, 1, 6};

        // put current sum in an array,
        //if current sum is 0 or current sum already exist in array then it has reset the sum to 0 and
        //then your are getting same current sum

        List<Integer> sumArray = new ArrayList<>();
        int sum = 0;
        boolean subArrayExists = false;
        for (int i = 0; i < num.length; i++) {
             sum = sum + num[i];
             if(sum ==0 || sumArray.contains(sum)){
                 subArrayExists = true;
             }else {
                 sumArray.add(sum);
             }
        }
        System.out.print("subArrayExists "+subArrayExists );
    }
}
