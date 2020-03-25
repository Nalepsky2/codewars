package com.nalepsky.kyu5.gapInPrimes;

class GapInPrimes {
    //https://www.codewars.com/kata/561e9c843a2ef5a40c0000a4
    public static long[] gap(int g, long m, long n) {
        long firstNumber = m;
        final long max = n - g;

        while(firstNumber <= max){
            final long secondNumber = firstNumber + g;
            if(secondNumber <= n
                    && isPrime(firstNumber)
                    && isPrime(secondNumber)
                    && !containsPrimeNumberInPeriod(firstNumber, secondNumber)){
                    return new long[] {firstNumber, secondNumber};
            }
            firstNumber++;
        }
        return null;
    }

    private static boolean isPrime(long l){
        for(long i = 2; i <= l/2; i++){
            if(l % i == 0){
                return false;
            }
        }
        return true;
    }

    private static boolean containsPrimeNumberInPeriod(long min, long max){
        for (long i = min + 1; i < max; i++) {
            if(isPrime(i)){
                return true;
            }
        }
        return false;
    }
}