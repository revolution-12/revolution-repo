package com.practice.coding.babar450.array;

public class MinimumSwapsAndKTogether {

    public static void main(String[] args) {
        int[] num = {2, 1, 5, 6, 3};
        int k = 3;

        //count no of all num
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] <= 3)
                count++;
        }
       // System.out.print(count);
        int bad = 0;
        for (int i = 0; i < count; i++) {
           if(num[i] > k)
                bad++;
        }

        int i =0 , j = count;
        int ans = bad;
        while (j < num.length){
            if(num[i] > k){
                bad--;
            }
            if(num[j] > k){
                bad++;
            }
            i++;j++;
            bad = Math.min(ans,bad);
        }

        System.out.print(bad);

    }
}
