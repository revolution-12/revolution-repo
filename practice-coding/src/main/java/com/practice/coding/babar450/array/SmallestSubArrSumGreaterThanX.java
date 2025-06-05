package com.practice.coding.babar450.array;

import java.util.Arrays;

public class SmallestSubArrSumGreaterThanX {
    public static void main(String[] args) {
        int[] num = {1, 4, 45, 6, 0, 19};
        int x = 51;

        int start =0 ,end = 0;
        int currSum = 0,minLength = Integer.MAX_VALUE;

        while(end< num.length){
            while(currSum <= x && end < num.length){
                currSum = currSum+num[end];
                end++;
            }
            while (currSum > x && start < num.length ){
                if(end - start < minLength){
                    minLength = end - start;
                }
                currSum = currSum - num[start];
                start++;
            }
        }

        System.out.print(minLength);
    }
}
