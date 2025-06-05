package com.practice.coding.babar450.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveSingleDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        Map<Integer,Integer> hm = new HashMap<>();
        for(int n : arr){
            if(hm.containsKey(n)){
                int count = hm.get(n) +1;
                hm.put(n,count);
            }else{
                hm.put(n,1);
            }
        }

        int duplicate = -1;
        for(Map.Entry es :hm.entrySet()){
            if((Integer) es.getValue() > 1){
                duplicate = (int) es.getKey();
            }
        }

        System.out.print("hashmap : "+duplicate);

        // With a single space -- Floyd's tortoise and hare algo for cycle detection
        // ( elements 1 to N and No of elements N+1)

        int slow = arr[0], fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        int slow2 = arr[0];
        while (slow2 != fast){
            slow2 = arr[slow2];
            fast = arr[fast];
        }

        System.out.println("Floyd "+slow2);

    }
}
