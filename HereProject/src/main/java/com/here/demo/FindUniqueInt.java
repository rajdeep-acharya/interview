package com.here.demo;


import java.util.*;

/**
 Please provide implementations to find the position of the first unique integer in an integer array.
 If no unique found then return -1.
 example:
 12,11,12,13,11 return 3
 **/

public class FindUniqueInt implements UniqueFinder<int[]>{

    @Override
    public int getFirstUnique(int[] input) {
        // 0 - 12,1
        // 1 - 11,1
        // 2 - 12,2

        // 12 - 0,2
        // 11 - 3
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        for(int i = 0 ; i < input.length ; i++) {
            if(map.containsKey(input[i])) {
                map.get(input[i]).add(i);
            } else {
                List<Integer> intList = new ArrayList<>();
                intList.add(i);
                map.put(input[i], intList);
            }
        }

        for (int j : input) {
            if (map.get(j).size() == 1) {
                return map.get(j).get(0);
            }
        }
        return -1;
    }
}
