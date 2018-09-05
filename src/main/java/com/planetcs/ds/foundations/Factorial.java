package com.planetcs.ds.foundations;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("5!" + factorial(3));
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number can't be negative!");
        }

        if ( n >= 1 ) {
            return n * n-1;
        }

        return 1;
    }
}
