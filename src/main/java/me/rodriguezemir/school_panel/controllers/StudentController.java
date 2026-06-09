package me.rodriguezemir.school_panel.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.rodriguezemir.school_panel.object.Student;

@RestController("v1")
public class StudentController {

    @GetMapping("student")
    public Student getStudent() {
        return new Student("Rodriguez Emir", 17);
    }

}