package com.nalepsky.kyu5.humanReadableTime;

public class HumanReadableTime {
    //https://www.codewars.com/kata/52685f7382004e774f0001f7
    public static String makeReadable(int seconds) {
        String h = seconds / 3600 + "";
        String m = (seconds % 3600) / 60 + "";
        String s = seconds % 60 + "";

        h = append(h);
        m = append(m);
        s = append(s);

        return String.format("%s:%s:%s", h, m, s);
    }

    private static String append(String s){
        if(s.length() == 1){
            s = "0" + s;
        }

        return s;
    }
}
