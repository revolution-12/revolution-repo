package com.practice.coding.leetcode.array.beginner;

public class LeftRotateByOnePlace {

    public static void main(String[] args) {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        int temp = num[0];
        for(int i = 0; i<num.length-1;i++){
            num[i] = num[i+1];
        }
        num[num.length-1]=temp;

        for(int i =0;i<num.length;i++){
            System.out.println(num[i]+" ");
        }
    }
}
