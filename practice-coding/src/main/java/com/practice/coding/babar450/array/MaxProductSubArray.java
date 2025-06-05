package com.practice.coding.babar450.array;

public class MaxProductSubArray {

    public static void main(String[] args) {
        int[] num = {-1, -3, -10, 0, 6};
        int minProd = num[0], maxProd = num[0], result = num[0];

        for (int i = 1; i < num.length; i++) {
            int curr = num[i];

            if(curr < 0 ){
                //if current is negative, after multiplication, greatest min becomes greatest max
                //greatest max becomes greatest min
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(curr,curr * maxProd);
            minProd = Math.min(curr,curr * minProd);

            result = Math.max(result,maxProd);

        }

        System.out.print("result "+result);
    }
}
