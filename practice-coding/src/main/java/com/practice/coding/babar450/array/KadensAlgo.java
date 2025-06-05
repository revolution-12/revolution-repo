package com.practice.coding.babar450.array;

public class KadensAlgo {

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        int currSum = 0, maxSum = 0;

        for (int n : arr) {
            currSum = currSum + n;

            if(currSum < 0){
                currSum = 0;
            }
            if(currSum > maxSum){
                maxSum = currSum;
            }

        }

        System.out.print(maxSum);
    }
}
