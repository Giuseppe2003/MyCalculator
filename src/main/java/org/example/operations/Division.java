package org.example.operations;

public class Division {

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisione per zero non permessa");
        }
        return a / b;
    }
}
