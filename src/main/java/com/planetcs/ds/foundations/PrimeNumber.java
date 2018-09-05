package com.planetcs.ds.foundations;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(3) == true);
        System.out.println(isPrime(5) == true);
        System.out.println(isPrime(6) == false);
    }

    private static boolean isPrime(int i) {
        for ( int x = 2 ; (x * x) <= i ; x++ ) {
            if ( i % x == 0 ) {
                return false;
            }
        }
        return true;
    }
}
