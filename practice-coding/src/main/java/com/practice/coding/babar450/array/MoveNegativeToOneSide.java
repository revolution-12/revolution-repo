package com.practice.coding.babar450.array;

import java.util.Arrays;

public class MoveNegativeToOneSide {

    public static void main(String[] args) {
        int[] num = {1,-2,3,-4,5,-6};
        int j  = 0 ;// this one is a pointer to next negative num
        //increment it when you have swapped and want to put at next place

        for(int i =0 ; i< num.length;i++){
            if(num[i] < 0 ){
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                j++;
            }
        }

        Arrays.stream(num).forEach(System.out::println);
    }
}
