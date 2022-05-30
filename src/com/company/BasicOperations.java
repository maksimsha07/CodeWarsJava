package com.company;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        int output = 0;
        switch (op) {
            case "+":
                output = v1 + v2;
                break;

            case "-":
                output = v1 - v2;
                break;

            case "*":
                output = v1 * v2;
                break;

            case "/":
                output = v1 / v2;
                break;
        }
        return output;
    }
}
