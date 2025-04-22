package com.practice.coding.babar450.array;

public class ReverseTheArray {

    public static void main(String[] args) {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};

        for(int i = 0,j=num.length-1; i <= j ;i++,j--){
            int temp = num[i];
            num[i] = num[j];
            num[j]  = temp;
        }

        for(int n : num){
            System.out.print(n+" ");
        }
    }
}
