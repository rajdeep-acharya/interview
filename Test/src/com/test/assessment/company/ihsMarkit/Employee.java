package com.test.assessment.company.ihsMarkit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    String name;
    Long age;

    Integer salary;

    public Employee(String name, Long age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("a", 30L, 3000));
        employeeList.add(new Employee("b", 29L, 3100));
        employeeList.add(new Employee("c", 32L, 3100));
        employeeList.add(new Employee("d", 31L, 2900));

        // d, a, b, c
        String employeeNameWithMaxSal = employeeList
            .stream()
            .max(Comparator.comparingInt(Employee::getSalary))
            .get().getName();
//        System.out.println(employeeNameWithMaxSal);

//        List<String> empNamesSorted =
        employeeList
            .stream()
            .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge))
//            .sorted(Comparator.comparingLong(com.test.assessment.company.ihsMarkit.Employee::getAge))
            .map(Employee::getName)
            .forEach(System.out::println);
//            .collect(Collectors.toList());

//            .collect(Collectors.groupingBy(t -> getSalary(t)), Collectors.counting())


//        String str = "abcxdcbya";
        String str = "abcxdcbxya";
//        "a" , "b", "c", "x", "d", "c", "b", "y", "a"
        int i=0;
        boolean match = false;
        char[] c = str.toCharArray();
        while (i < c.length) {
            int j = i+1;
            while (j < c.length) {
                if (c[i] == c[j]) {
                    match = true;
                    break;
                } else {
                    j++;
                }
            }
            if(!match) {
               System.out.println(c[i]);
               break;
            } else {
                match = false;
            }
            i++;
        }

//            index, count


    }





/*    private static boolean match(char[] c, int j, int arrLength) {
        int i = c.length;
        while (i >= 0) {
            match(c[i]),
        }
    }*/
}
