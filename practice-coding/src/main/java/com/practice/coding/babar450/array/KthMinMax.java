package com.practice.coding.babar450.array;

import java.util.Arrays;

public class KthMinMax {

    public static void main(String[] args) {
        int[] num = {7, 10, 4, 3, 20, 15,25};
        int k =3;

        Arrays.sort(num);
        int KSmall = num[k-1];
        int KLarge = num[num.length-k];

        System.out.print(KSmall+ " "+KLarge);
    }
}
