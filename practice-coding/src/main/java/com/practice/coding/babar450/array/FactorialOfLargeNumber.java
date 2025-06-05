package com.practice.coding.babar450.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FactorialOfLargeNumber {

    public static void main(String[] args) {

        int num = 5;

        List<Integer> result = new ArrayList<>();
        result.add(1);

        for (int i = 2; i <= num; i++) {
            int carry = 0;
            for (int j = 0; j < result.size(); j++) {
                int prod = result.get(j) * i + carry;
                result.set(j, prod % 10);
                carry = prod / 10;
            }
            while (carry > 0) {
                result.add(carry % 10);
                carry = carry / 10;
            }
        }

        Collections.reverse(result);
        result.forEach(n-> System.out.print(n+ " "));

    }
}
