package com.practice.coding.babar450.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairOfSum0 {

    public static void main(String[] args) {
        Integer[] arr = {2, -2, 3, 1, -3, 0};//{1, 5, 7, -1, 5};
        int sum = 0;

        Map<Integer,Integer> freqMap = new HashMap<>();
        int count = 0;
        for(int i = 0 ;i < arr.length;i++){
            int complement = sum - arr[i];
            if(freqMap.containsKey(complement)){
                count++;
                freqMap.put(arr[i],freqMap.get(complement)+1);
            }else{
                freqMap.put(arr[i],1 );
            }
        }

        System.out.print(count);
    }
}
