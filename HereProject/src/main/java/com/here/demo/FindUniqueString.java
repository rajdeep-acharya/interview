package com.here.demo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 Please provide implementations to find the position of the first unique character in a String.
 If no unique found then return -1.
 example:
 "abbacd" - return 4
 **/
public class FindUniqueString implements UniqueFinder<String>{

    // "a" - 0,3
    // "b" - 1,2
    // "c" - 4
    // "d" - 5
    @Override
    public int getFirstUnique(String input) {
        Map<Character, List<Integer>> map = new LinkedHashMap<>();
        if (input == null || input.equals("")) {
            return -1;
        }
        char[] charArray = input.toCharArray();
        for(int i = 0 ; i < charArray.length ; i++) {
            if(map.containsKey(charArray[i])) {
                map.get(charArray[i]).add(i);
            } else {
                List<Integer> intList = new ArrayList<>();
                intList.add(i);
                map.put(charArray[i], intList);
            }
        }

        for (char c : charArray) {
            if (map.get(c).size() == 1) {
                return map.get(c).get(0);
            }
        }
        return -1;
    }
}
