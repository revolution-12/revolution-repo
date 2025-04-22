package com.practice.coding.leetcode.array.beginner;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {
        int[] num = {1,4,6,8,9,11,18,47,90};
        boolean isSorted = false;

        for (int i =0;i<num.length-1;i++){
            if(num[i] < num[i+1]){
                isSorted = true;
            }else{
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
