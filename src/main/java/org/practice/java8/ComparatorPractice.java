package org.practice.java8;

import org.practice.java8.model.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorPractice {
    public static void main(String[] args) {
        List<Student> al = Arrays.asList(new Student(1, "Shubham", 95),
                new Student(2, "Kunal", 75), new Student(3, "Mi", 85));
        Collections.sort(al, (a, b) -> b.getName().length() - a.getName().length());
        al.forEach(x -> System.out.println(x.getId() + " " + x.getName() + " " + x.getMarks()));
    }
}
