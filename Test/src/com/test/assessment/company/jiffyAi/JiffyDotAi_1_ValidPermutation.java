package com.test.assessment.company.jiffyAi;

import java.util.*;

public class JiffyDotAi_1_ValidPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string : ");
        String s1 = sc.next();
        System.out.print("Enter 2nd string : ");
        String s2 = sc.next();
        if (s1 == null || s1.length() == 0) {
            System.out.print("ERROR : First string null/empty not allowed.");
            return;
        }
        System.out.print("Output : ");
        System.out.print(isStringValidPermutation(s1, s2));
    }

    // implement a method two string args & return boolean
    // "polo", "pool" - return true
    // "polo", "poll" - return false

    private static boolean isStringValidPermutation(String s1, String s2) {

        if (s2 == null || s2.length() == 0) {
            return false;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i=0 ; i < s1.length() ; i++) {
            if(map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            } else {
                map.put(s1.charAt(i), 1);
            }
        }

        for (int j=0 ; j < s2.length() ; j++) {
            if(map.containsKey(s2.charAt(j))) {
                map.put(s2.charAt(j), map.get(s2.charAt(j)) - 1);
            } else {
                return false;
            }
        }
        return map.values().stream().allMatch(v -> v.equals(0));
    }
}
