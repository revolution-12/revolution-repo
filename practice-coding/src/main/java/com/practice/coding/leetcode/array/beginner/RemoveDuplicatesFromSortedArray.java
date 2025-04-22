package com.practice.coding.leetcode.array.beginner;

public class RemoveDuplicatesFromSortedArray {

    //index is a slow pointer keeping track of location to swap/move
    //keeping it at index 1 as first number is always unique
    //we are comparing i and i+1
    public static void main(String[] args) {
        int[] num = {1,1,4,6,8,9,11,18,18,47,90,90};
        int index = 1;
        for(int i =0 ;i<num.length-1;i++){
            if(num[i] != num[i+1]){
                num[index] = num[i+1];
                index++;
            }
        }

       for(int i =0 ;i < num.length;i++){
           System.out.println(num[i]);
       }
    }
}
