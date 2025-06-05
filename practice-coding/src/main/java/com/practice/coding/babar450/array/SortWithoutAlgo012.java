package com.practice.coding.babar450.array;


import java.util.Arrays;

public class SortWithoutAlgo012 {

    public static void main(String[] args) {
        //counting number of 0 1 2 and adding them in array  -- but this is not a in place approach and
        //some interviewers may prefer Dutch National Flag Algorithm (by Edsger Dijkstra)

        int[] num = {2, 0, 2, 1, 1, 0};

        int low = 0, mid = 0, high = num.length - 1;
        for (int i = 0; mid<high; i++) {
            if(num[mid] == 0){
                swap(low,mid,num);
                low++;mid++;
            }
            if(num[mid] == 1){
                mid++;
            }
            if(num[mid] == 2){
                swap(mid,high,num);
                mid++;high--;
            }
        }

        Arrays.stream(num).forEach(System.out::print);


    }

    private  static void swap(int a, int b, int[] num){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
}
