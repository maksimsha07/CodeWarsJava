package com.company;

public class Needle {
    public static String findNeedle (Object[] haystack) {
        String needle = "needle";
        int position = 0;

        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                position = i;
            }
        }

        return "found the needle at position " + position;
    }
}
