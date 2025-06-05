package com.practice.coding.babar450.array;

public class StockBuySell121 {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        int currentMin = arr[0];
        int maxProfit = 0;

        for(int i =0 ; i < arr.length; i++){
            currentMin = Math.min(currentMin,arr[i]);
            int currProfit = arr[i] - currentMin;
            maxProfit = Math.max(maxProfit,currProfit);
        }
        System.out.print("maxProfit "+maxProfit);
    }
}
