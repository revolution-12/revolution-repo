package com.practice.coding.babar450.array;

import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] building = {3, 0, 1, 0, 4, 0 ,2};

        int[] left = new int[building.length];
        int[] right = new int[building.length];

        int maxLength = building[0];
        left[0] = building[0];
        for(int i =1; i< building.length;i++){
            maxLength = Math.max(maxLength,building[i]);
            left[i] = maxLength;
        }

        maxLength = building[building.length-1];
        right[right.length-1] = building[building.length-1];
        for(int i = building.length-2; i >=0 ; i--){
            maxLength= Math.max(maxLength,building[i]);
            right[i] = maxLength;
        }

        int trappedWater = 0;
        for(int i =0 ; i < building.length; i ++){
            trappedWater = trappedWater + Math.min(left[i],right[i])-building[i];
        }

        System.out.print(" "+ trappedWater);

       // Arrays.stream(left).forEach(l-> System.out.print(l+" "));
       // Arrays.stream(right).forEach(r-> System.out.print(r+" "));
    }
}
