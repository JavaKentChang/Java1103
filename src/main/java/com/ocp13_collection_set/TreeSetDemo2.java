
package com.ocp13_collection_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Set<Exam> exams = new TreeSet<>();//Exam 裡沒有實作，會發生Exam cannot be cast to java.lang.Comparable
        for (int i = 0; i < 5; i++) {
            exams.add(new Exam());            
        }
        System.out.println(exams);
    }
}
