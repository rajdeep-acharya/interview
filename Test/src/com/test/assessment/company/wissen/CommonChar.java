package com.test.assessment.company.wissen;

import java.util.*;
import java.util.stream.Collectors;

public class CommonChar {
    public static void main(String[] args) {
        String first = "abcbcd";
        String second = "cdefef";
        String common = commonCharacters(first, second);
        System.out.println("common characters in '" + first + "' and '" + second + "' are '" + common + "'");

        String first1 = "abc";
        String second1 = "dcb";
        String common1 = commonCharacters(first, second);
        System.out.println("common characters in '" + first1 + "' and '" + second1 + "' are '" + common1 + "'");

    }

    public static String commonCharacters(String firstString, String secondString) {

        char[] strArr = firstString.toCharArray();
        Set<Character> characterSetFirst = new HashSet<>();
        for(int i=0 ; i < strArr.length ; i++) {
            characterSetFirst.add(strArr[i]);
        }
        Map<Character, Integer> map = new HashMap<>();
        for (Character character : characterSetFirst) {
            map.put(character, 0);
        }

        char[] strArr1 = secondString.toCharArray();
        Set<Character> characterSetSecond = new HashSet<>();
        for(int i=0 ; i < strArr1.length ; i++) {
            characterSetSecond.add(strArr1[i]);
        }
        for (Character character : characterSetSecond) {
            if(map.containsKey(character)) {
                map.put(character, map.get(character)+1);
            } else {
                map.put(character, 0);
            }

        }
        return  map.entrySet()
            .stream()
            .filter(c -> c.getValue() > 0)
            .collect(Collectors.toList()).toString();
    }

}
