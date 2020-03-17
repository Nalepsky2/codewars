package com.nalepsky.kyu6.persistentBugger;

class Persist {
    //https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec
    public static int persistence(long n) {
        if(n < 10){
            return 0;
        }

        long newNumber = String.valueOf(n)
                .chars()
                .mapToObj(c -> (char) c)
                .map(c -> c - 48)
                .reduce(1, (res, el) -> res * el);

        return persistence(newNumber) + 1;
    }
}
