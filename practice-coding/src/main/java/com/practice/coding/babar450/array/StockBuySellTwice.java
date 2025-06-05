package com.practice.coding.babar450.array;

import java.util.Arrays;

public class StockBuySellTwice {

    public static void main(String[] args) {
        int[] stock = {10, 22, 5, 75, 65, 80};
        int[] profitArray = new int[stock.length];

        int maxPrice = stock[stock.length - 1];
        for (int i = stock.length - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, stock[i]);
            int currProfit = maxPrice - stock[i];
            profitArray[i] = Math.max(profitArray[i + 1], currProfit);
        }

        int minPrice = stock[0];
        for(int i = 1; i <stock.length;i++){
            minPrice= Math.min(minPrice,stock[i]);
            int currProfit = stock[i] - minPrice;
            profitArray[i] = Math.max(profitArray[i-1],profitArray[i]+currProfit);
        }
        //Arrays.stream(profitArray).forEach(n-> System.out.print(n+" "));
        int finalProfit = Arrays.stream(profitArray).max().getAsInt();
        System.out.print(finalProfit);
    }
}
