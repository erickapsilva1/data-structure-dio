package com.projeto.javamap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> student = new HashMap<>();

        student.put("Name", "Plato");
        student.put("Age", "25");
        student.put("Average", "9.2");
        student.put("Class", "5B");

        System.out.println(student);
        System.out.println(student.keySet());
        System.out.println(student.values());

        List<Map<String, String>> studentList = new ArrayList<>();

        Map<String, String> student2 = new HashMap<>();

        student2.put("Name", "Nietzsche");
        student2.put("Age", "36");
        student2.put("Average", "7.2");
        student2.put("Class", "5C");

        studentList.add(student);
        studentList.add(student2);

        System.out.println(studentList);

        System.out.println(student.containsKey("Name"));

    }
}
