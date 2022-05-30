package com.company;

import java.util.Arrays;

public class Digitize {
    public static int[] digitize(long n) {

        String tempString = Long.toString(n);

        int[] output = Arrays.asList(tempString).stream().mapToInt(Integer::parseInt).toArray();

        return output;

    }
}
