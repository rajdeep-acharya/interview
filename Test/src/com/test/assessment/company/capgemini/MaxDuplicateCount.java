package com.test.assessment.company.capgemini;

import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxDuplicateCount {

/*
    Get the most repeated IP address from below list,
    solution should be generic.
    In below example 192.168.1.102 is the most repeated IP.

        List<String> list = Arrays.asList(
        "192.168.1.102- com.ab.c.Abc abc xyz",
        "192.168.1.102- com.ab.c.ajd ewe wer",
        "192.168.1.107- com.ab.c.Sss ewr whr",
        "192.168.1.107- com.ab.c.AAd jkj sds",
        "192.168.1.106- com.ab.c.Aads data sub",
        "192.168.1.106- com.ab.c.Abad dfsdL jhj",
        "192.168.1.104- com.ab.c.Esdsc hdsa sa",
        "192.168.1.105- com.ab.c.Aabc a idi ew",
        "192.168.1.100- com.ab.c.Dbc sf hfjs",
        "192.168.1.101- com.ab.c.Hebc adssa sa",
        "192.168.1.102- com.ab.c.Kbc asds asf");

        input =
        192.168.1.102, 192.168.1.102, 192.168.1.107, 192.168.1.107, 192.168.1.106, 192.168.1.106,
        192.168.1.104, 192.168.1.105, 192.168.1.100, 192.168.1.101, 192.168.1.102

*/



    private static Map<String, Long> findDuplicate(List<String> list) {
        return list.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//            .collect(Collectors.toMap(List::get,))
//            .max(Comparator.comparingLong());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input : \n");
        String str = scanner.nextLine();
//        char[] c = str.toCharArray();
        String[] strArr = str.split(", ");
//        List<String> list = str.chars().mapToObj(c -> (String) c).collect(Collectors.toList());
//            .forEach(strArr -> ).collect(Collectors.toList());
        List<String> list = Arrays.asList(strArr);
//            list.forEach(l -> System.out.println(l));
        Map<String, Long> map = findDuplicate(list);
//        map.forEach((k, v) -> System.out.println(k + " : "+ v));
        Long maxValueInMap = Collections.max(map.values());
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if(Objects.equals(entry.getValue(), maxValueInMap)) {
                System.out.println("Output : " + entry.getKey());
            }
        }
    }
}
