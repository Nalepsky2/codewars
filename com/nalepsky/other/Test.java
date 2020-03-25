package com.nalepsky.other;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    private static long count(int[] numbers){
        final List<Integer> n = new ArrayList<>();
        final AtomicInteger counter = new AtomicInteger(0);
        final AtomicInteger leftIndex = new AtomicInteger(0);
        final AtomicInteger rightIndex = new AtomicInteger(0);
        for (int i = 0; i < numbers.length; i++) {
            n.add(numbers[i]);
        }

        n.forEach(el ->{
            int lastIndex = n.size() - 1;
            if(n.get(0).equals(n.get(lastIndex))){
                counter.getAndIncrement();
                n.remove(0);
                n.remove(lastIndex);
            } else {
                Integer left = getPositiveValue(n.get(0));
                Integer right = getPositiveValue(n.get(lastIndex));

                if(left < right){
                    n.remove(0);
                } else {
                    n.remove(lastIndex);
                }
            }
        });

        return counter.get();
    }

    private static Integer getPositiveValue(Integer i){
        return (i < 0) ? i * -1 : i;
    }

    public static void main(String []args) {
        int[] test = {1, 2, 3};
        System.out.println(count(test));
        int[] test2 = {-1, -2, 1, 2, 3};
        System.out.println(count(test2));
        int[] test3 = {-1, -2, -3, 1, 2, 3, -1, -1, 1, 1};
        // -3 -1 1 2 3;
        System.out.println(count(test3));
    }
}
