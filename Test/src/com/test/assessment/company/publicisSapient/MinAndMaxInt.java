/*
package com.test.assessment.company.publicisSapient;

// package whatever; // don't place package name!
// Installed Libraries: JSON-Simple, JUNit 4, Apache Commons Lang3
import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinAndMaxInt {
    // Given an array A of size N of integers.
    // Your task is to find the minimum and maximum elements in the array.
    // A[] = {3, 2, 1, 56, 10000, 167}
    // https://codeinterview.io/UCSMJHZLFR

        public static void main(String[] args) {
            int[] A = {3, 2, 1, 56, 10000, 167};

            List<Integer> list = Arrays
                .stream(A)
                .boxed()
                .collect(Collectors.toList());
//
//            for(int i=0 ; i < A.length ; i++) {
//                list.add(A[i]);
//            }

            Integer maxInt = Arrays
                .stream(A)
                .max()
                .getAsInt();
            System.out.println(maxInt);

            Integer minInt = Arrays
                .stream(A)
                .min()
                .getAsInt();
            System.out.println(minInt);

        }



}
*/


