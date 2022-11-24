package com.test.assessment.company.altimetrik.hackerRank;

public class T {

    static  int c = 0;

    public static void main(String[] args) {
        T t1 = c();
        T t2 = c(t1);
        T t3 = c(t2);
        T t4 = c(t3);
    }

    private T() {
        System.out.print("c= " + c + "    ");
    }

    static T c() {
        return c++ <= 0 ? new T() : null;
    }

    static T c(T t) {
        return t.c++ == 1 ? new T() : null;
    }

}
