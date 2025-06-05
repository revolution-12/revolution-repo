package com.practice.coding.babar450.array;

import java.util.Arrays;

public class CyclicRotationByOne {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6,8,10};
        int firstPlace = arr1[0];
        for(int i = 0;i <arr1.length-1;i++){
            arr1[i] = arr1[i+1];
        }
        arr1[arr1.length-1]= firstPlace;

        Arrays.stream(arr1).forEach(n-> System.out.print(n+" "));
    }
}
