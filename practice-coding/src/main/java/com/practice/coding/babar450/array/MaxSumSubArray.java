package com.practice.coding.babar450.array;

public class MaxSumSubArray {

    public static void main(String[] args) {
        int maxSum = Integer.MIN_VALUE, currSum = 0;

        int[] num = {-2,1,-3,4,-1,2,1,-5,4};

        for(int i =0 ;i<num.length;i++){
            currSum = currSum+num[i];
            if(maxSum<currSum){
                maxSum = currSum;
            }
            if(currSum<0){
                currSum = 0;
            }
        }

        System.out.print(maxSum);
    }
}
