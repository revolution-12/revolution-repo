package com.practice.coding.babar450.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {
        //check if the number before current is available.
        //if not then it means it is the starting point of sequence
        //maintaining maxlegnth in case there are multiple sequences.
        int[] num = {2, 6, 1, 9, 4, 5, 3};
        Set<Integer> hs = new HashSet<>();

        for (int n : num) {
            hs.add(n);
        }

        int maxLength = 0;
        for (int n : num) {
            if (!hs.contains(n - 1)) {
                int currentMaxL = 1;
                int current = n;
                while (hs.contains(current + 1)) {
                    currentMaxL++;
                    current ++;
                }
                maxLength = Math.max(maxLength, currentMaxL);
            }
        }

        System.out.print(maxLength);
    }
}
