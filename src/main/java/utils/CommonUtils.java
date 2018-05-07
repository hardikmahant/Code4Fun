package utils;

public class CommonUtils {
    public static void printArray(int[] data) {
        if ( data == null || data.length == 0 ) {
            return;
        }

        for ( int x : data ) {
            System.out.print(x + " ");
        }
    }
}
