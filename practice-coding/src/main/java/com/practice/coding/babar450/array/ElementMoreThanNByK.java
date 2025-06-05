package com.practice.coding.babar450.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ElementMoreThanNByK {

    public static void main(String[] args) {
        int[] num = {3, 4, 2, 2, 1, 2, 3, 3};
        int k = 4;

        Map<Integer,Integer> hm = new HashMap<>();
       /* for(int n : num){
            int count = 1;
            if(hm.containsKey(n)){
                count = hm.get(n)+1;
            }
            hm.put(n,count);
        }*/

        for (int n : num){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() > num.length/k){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
