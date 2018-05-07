package lc;

import utils.CommonUtils;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] data = {7, 100, 2, 8, 234, 20, 80};
        int target = 180;
        CommonUtils.printArray(twoSum(data, target));
    }

    public static int[] twoSum(int[] data, int target) {
        if ( data == null || data.length <= 2 ) {
            return data;
        }

        int[] result = new int[2];
        Map<Integer, Integer> helper = new HashMap<>();

        //Element to index mapping
        for ( int i = 0 ; i < data.length ; i++  ) {
            helper.put(data[i], i);
        }

        for ( int i = 0 ; i < data.length ; i++ ) {
            int key = target - data[i];
            if ( helper.containsKey(key) ) {
                result[0] = i;
                result[1] = helper.get(key);
                return result;
            }
            helper.put(data[i], i);
        }

        return null;
    }
}
