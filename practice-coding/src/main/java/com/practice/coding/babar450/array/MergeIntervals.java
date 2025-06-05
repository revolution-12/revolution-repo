package com.practice.coding.babar450.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        // solved using linked list traverse
        List<int[]> merged = new ArrayList<>();

        int k = 0;
        merged.add(intervals[0]);
        int[] currInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];

            if (currInterval[1] >= nextInterval[0]) {
                currInterval[1] = Math.max(currInterval[1], nextInterval[1]);
            } else {
                currInterval = nextInterval;
                merged.add(currInterval);
            }
        }

       // merged.forEach(n -> System.out.print("[" + n[0] + "]" + "[" + n[1] + "], "));

        //two pointer approach
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int j = 0;
        for (int i = 1; i < intervals1.length; i++) {
            if (intervals1[i][0] <= intervals1[j][1]) {
                intervals1[j][1] = Math.max(intervals1[i][1], intervals1[j][1]);
            } else {
                j++;
                intervals1[j] = intervals1[i];
            }
        }
        System.out.println(" 2 pointer approach ");
        Arrays.stream(intervals1).forEach(n -> System.out.print(Arrays.toString(n) + " "));
    }
}
