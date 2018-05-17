package lc;


import java.util.HashMap;
import java.util.Map;

/*

Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/
public class TwoSum_lc001 {
    public static void main(String[] args) {
        int[] data = {2, 7, 11, 15};
        int target = 9;

        for ( int i : twoSum(data, target) ) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] data, int target) {
        //Boundary check
        if (data == null || data.length == 0) {
            return new int[0];
        }

        // Element to Index mapping
        Map<Integer, Integer> etoi = new HashMap<>();

        for ( int i = 0 ; i < data.length ; i++ ) {
            if ( etoi.containsKey(target - data[i]) ) {
                return new int[]{etoi.get(target - data[i]), i};
            } else {
                etoi.put(data[i], i);
            }
        }

       return new int[0];
    }
}
