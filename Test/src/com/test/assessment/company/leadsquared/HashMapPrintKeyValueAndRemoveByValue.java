package com.test.assessment.company.leadsquared;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class HashMapPrintKeyValueAndRemoveByValue {

    private enum JavaVersion {

        SIX(6), EIGHT(8);

        private final int value;
        JavaVersion(int v) {value = v;}
        public int value() {return value;}
    }

    private static void print(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value : "+ entry.getValue());
        }
    }

    private static Map<String, String> removeByValue(Map<String, String> map, String value, JavaVersion javaVersion) {

        if (javaVersion.equals(JavaVersion.EIGHT)) {
            return map
                .entrySet()
                .stream()
                .filter(v -> !v.getValue().equals(value))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        }

        if (javaVersion.equals(JavaVersion.SIX) && map.containsValue(value)) {
            List<String> keyList = new ArrayList<>();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().equals(value)) {
                    keyList.add(entry.getKey());
                }
            }
            for (String key : keyList) {
                map.remove(key);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        map.put("4", "D");
        map.put("5", "E");
        map.put("6", "F");
        print(map);
        System.out.println("--- After remove \"A\"(Java 6 way) ---");
        removeByValue(map, "A", JavaVersion.SIX);
        print(map);
        System.out.println("--- After remove \"B\"(Java 8 way)-- DID NOT REMOVE ---");
        // This DONOT remove "B" from Map, as Java Stream always returns a new collection
        removeByValue(map, "B", JavaVersion.EIGHT);
        print(map);
        // Whereas this will delete
        System.out.println("--- After remove \"B\"(Java 8 way) ---");
        print(removeByValue(map, "B", JavaVersion.EIGHT));
    }
}
