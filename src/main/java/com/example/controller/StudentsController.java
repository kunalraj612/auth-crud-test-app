package com.example.controller;

import com.example.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentsController {

    public List<Student> studentList = new ArrayList<Student>(List.of(
            new Student(1,"David","CSE")
    ));


    @GetMapping("students")
    public List<Student> getStudents(){
        Student student1 = new Student();
        return studentList;
    }

}
