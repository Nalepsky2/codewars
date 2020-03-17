package com.nalepsky.kyu6.playingWithDigits;

import java.util.concurrent.atomic.AtomicInteger;

public class DigPow {

    public static long digPow(int n, int p) {
        final AtomicInteger counter = new AtomicInteger(p);

        long l = Integer.valueOf(n)
                .toString()
                .chars()
                .map(i -> i - 48)
                .reduce(0, (val, i) -> val + (int)Math.pow(i, counter.getAndIncrement()));

        if(l%n == 0){
            return l/n;
        }

        return -1;
    }

}