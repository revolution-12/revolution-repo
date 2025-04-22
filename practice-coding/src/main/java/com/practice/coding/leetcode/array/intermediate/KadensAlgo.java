package com.practice.coding.leetcode.array.intermediate;

public class KadensAlgo {

    public static void main(String[] args) {
        int[] nums = {};//{5,4,-1,7,8};//{1};//{-2,1,-3,4,-1,2,1,-5,4};

        int currSum =0, maxSum =Integer.MIN_VALUE ;
        for(int i=0;i< nums.length;i++){
            currSum = currSum + nums[i];

            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0) {
                currSum =0;
            }
        }
        System.out.println(" max sum " + maxSum);
    }
}
