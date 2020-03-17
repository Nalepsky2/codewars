package com.nalepsky.kyu6.createPhoneNumber;

public class Kata {
    //https://www.codewars.com/kata/525f50e3b73515a6db000b83
    public static String createPhoneNumber(int[] numbers) {
        final String firstPart = "" + numbers[0] + numbers[1] + numbers[2];
        final String secondPart = "" + numbers[3] + numbers[4] + numbers[5];
        final String thirdPart = "" + numbers[6] + numbers[7] + numbers[8] + numbers[9];

        return String.format("(%s) %s-%s", firstPart, secondPart, thirdPart);
    }
}
