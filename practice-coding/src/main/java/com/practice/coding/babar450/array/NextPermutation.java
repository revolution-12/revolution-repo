package com.practice.coding.babar450.array;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 4, 3, 1};
        int i = nums.length-2;
        while(i >=0 && nums[i] >= nums[i+1]){
            i--;
        }

        int j = nums.length-1;
        while(j != 0 && nums[j] <= nums[i]){
            j--;
        }

        swap(nums,i,j);

        reverse(nums ,i+1, nums.length-1);

        Arrays.stream(nums).forEach(n-> System.out.print(n+ " "));
    }


    private static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


