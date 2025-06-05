package com.practice.coding.babar450.array;

import java.util.Arrays;

public class TripletOfSumInArray {

    public static void main(String[] args) {
        int[] num = {1, 4, 45, 6, 10, 8};
        int target = 13;

        Arrays.sort(num);
        boolean isTripletAvailable = false;
        for (int i = 0; i < num.length; i++) {
            int currentTarget = target - num[i];
            int low = i + 1;
            int high = num.length - 1;

            while (low < high) {
                if (num[low] + num[high] == currentTarget) {
                    isTripletAvailable = true;
                    break;
                } else if (num[low] + num[high] > currentTarget) {
                    high--;
                } else {
                    low++;
                }
            }

        }
        System.out.print("isTripletAvailable " + isTripletAvailable);
    }
}
