package com.example.student.controller;

import com.example.student.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class StudentController {
    private List<Student> studentList = new ArrayList<>();
    @GetMapping("/studentlist")
    public List<Student> getStudent() {
        return studentList;
    }

    @GetMapping("/student")
    public String student(@RequestParam String student) {
        return student;
    }

    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student) {
        return student;
    }

}
