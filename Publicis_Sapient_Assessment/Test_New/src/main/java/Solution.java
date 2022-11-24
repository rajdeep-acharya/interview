/*
input - {"mat","rat","cat","art","amt","tar"}
output - [["mat","amt"],["rat","art","tar"],["cat"]]
*/
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

// key - sorted string "amt",  value - "mat"

class Solution {
    public static void main(String[] args) {
        String[] input = {"mat","rat","cat","art","amt","tar"};

        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0 ; i < input.length ; i++) {
            String str = input[i];
            char[] c= input[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(map.containsKey(s)) {
                map.get(s).add(str);
            } else {
                List<String> list1 = new ArrayList<>();
                list1.add(str);
                map.put(s, list1);
            }
        }
        System.out.println(map);
    }
}
