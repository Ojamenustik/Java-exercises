package com.ania;

import java.util.Optional;
import java.util.function.Supplier;


public class Student {

    private Long id;
    private String name;
    private String university;

    public Student(Long id, String name, String university) {
        this.id = id;
        this.name = name;
        this.university = university;
    }
    Supplier<Student> studentSupplier = () -> new Student(5L, "", "");

//    private void printStudent() {
//        Long studentId = 1L;
//        Student student = Optional.ofNullable(studentService.getById(studentId))
//                .orElseGet(studentSupplier);
//
//        System.out.println(student);
//    }
}
