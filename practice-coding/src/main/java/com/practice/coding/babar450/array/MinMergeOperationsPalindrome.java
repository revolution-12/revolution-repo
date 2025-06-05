package com.practice.coding.babar450.array;

public class MinMergeOperationsPalindrome {

    public static void main(String[] args) {
        int[] num = {1, 4, 5, 1};
        int ans = 0;

        for(int i =0, j = num.length-1; i <=j;){
            if(num[i] == num[j]){
                i++;j--;
            }else if(num[i] > num[j]){
                j--;
                num[j] = num[j]+num[j+1];
                ans ++;
            }else{
                i++;
                num[i] = num[i] +num[i-1];
                ans++;
            }
        }

        System.out.print("ans "+ans);

    }
}
