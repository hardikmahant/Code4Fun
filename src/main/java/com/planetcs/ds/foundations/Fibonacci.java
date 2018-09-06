package com.planetcs.ds.foundations;

public class Fibonacci {
    public static void main(String[] args) {
        //nTh fibo
        System.out.println(nThFibo(6));

        //Print series up to N
        //O(2 ^ n)
        for ( int i = 0 ; i < 10 ; i++ ) {
            System.out.print(nThFibo(i)+", ");
        }
    }

    // O(2 ^ n)
    private static int nThFibo(int n) {
        if ( n <= 0 ) {
            return 0;
        } else if ( n == 1 ) {
            return 1;
        }
        return nThFibo(n-1) + nThFibo(n-2);
    }
}
