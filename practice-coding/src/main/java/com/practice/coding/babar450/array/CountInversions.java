package com.practice.coding.babar450.array;

public class CountInversions {

    public static void main(String[] args) {
        //bruite force
        int[] num = {2, 4, 1, 3, 5};
        int counter = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    counter++;
                }
            }
        }

        // System.out.print(counter);

        //merge sort example
        int count = mergesort(num,0,num.length-1);
        System.out.print(count);
    }

    private static int mergesort(int[] num, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right )/ 2;
            count = count + mergesort(num, left, mid);
            count = count + mergesort(num, mid + 1, right);
            count = count + merge(num, left, mid, right);
        }
        return count;
    }

    private static int merge(int[] num, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        int invCount = 0;

        while (i <= mid && j <= right) {
            if (num[i] <= num[j]) {
                temp[k] = num[i];
                k++;
                i++;
            } else {
                temp[k] = num[j];
                k++;
                j++;
                invCount = invCount + (mid - i + 1); // did not understand
            }
        }

        //remaining
        while (i <= mid) {
            temp[k] = num[i];
            k++;
            i++;
        }
        while (j <= right) {
            temp[k] = num[j];
            k++;
            j++;
        }
        k = 0;
        for (i = left; i <= right; i++) {
           num[i] = temp[k];
           k++;
        }

        return invCount;
    }
}
