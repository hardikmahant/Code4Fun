package com.planetcs.ds.foundations;

public class Permutations {
    public static void main(String[] args) {
        permutatios("abcd", "");
    }

    //O (n2 * n!)
    private static void permutatios(String abx, String prefix) {
            if ( abx.length() == 0 ) {
                System.out.println(prefix);
            } else {
                for ( int i = 0 ; i < abx.length() ; i++ ) {
                    String rem = abx.substring(0,i) + abx.substring(i+1);
                    permutatios(rem, prefix+abx.charAt(i));
                }
            }
    }
}
