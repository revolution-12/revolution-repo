package com.practice.coding.leetcode.array.beginner;

public class MaxMinElement {

    public static void main(String[] args) {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        int min =0 , max = 0;
        for(int i =0 ;i < num.length;i++){
            if(num[i] < min){
                min = num[i];
            }else{
                max = num[i];
            }
        }
        System.out.println("min "+min+" max "+max);
    }
}
