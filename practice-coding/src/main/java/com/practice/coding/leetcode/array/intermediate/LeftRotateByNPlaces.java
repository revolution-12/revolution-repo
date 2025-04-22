package com.practice.coding.leetcode.array.intermediate;

public class LeftRotateByNPlaces {

    public static void main(String[] args) {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        int n = 2 ; // rotate by 2
        // reverse algorithm
        reverse(0,n-1,num); // reverse 0 to number -1
        reverse(n,num.length-1,num); // reverse second half
        reverse(0,num.length-1,num); // reverse complete array


        for(int no : num){
            System.out.print(no + " ");
        }

    }

    private static void reverse(int start, int end,int[] num){
        while (start <= end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start ++; end --;
        }
    }
}
