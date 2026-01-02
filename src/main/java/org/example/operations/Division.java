package org.example.operations;

public class Division {

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Non si può dividere per zero");
        }
        return a / b;
    }
}
