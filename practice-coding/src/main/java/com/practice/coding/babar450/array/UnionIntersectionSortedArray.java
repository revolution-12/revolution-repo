package com.practice.coding.babar450.array;

import java.util.*;

public class UnionIntersectionSortedArray {
    //since both arrays are sorted we can compare their elements one by one
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        //Intersection

        //other way hashset
        Set<Integer> hashSet = new HashSet<>();
        Arrays.stream(arr1).forEach(hashSet::add);
        Arrays.stream(arr2).forEach(hashSet::add);

        hashSet.forEach(System.out::println);
        // Union
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            }else{
                union.add(arr1[i]);
                i++;j++;
            }
        }
        union.forEach(n-> System.out.print(n+" "));

    }
}
