package com.practice.coding.babar450.array;

import java.util.HashSet;
import java.util.Set;

public class IsArraySubset {

    //A HashSet is backed by a hash table, which allows direct access to elements using their hash codes.
    //When you call .contains(x), it:
    //Computes the hash code of x
    //Goes directly to the bucket where x would be
    //Checks if x is present (possibly with a few comparisons in case of hash collisions)
    //So unless there are many hash collisions, lookup is constant time.

    public static void main(String[] args) {
        int a[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int b[] = {11, 3, 7, 1, 7};

        Set<Integer> hs = new HashSet<>();
        for(int i : a){
            hs.add(i);
        }

        boolean isSubset = true;
        for(int i : b){
            if(!hs.contains(i)){
                isSubset = false;
            }
        }

        System.out.print("isSubset " +isSubset);
    }
}
