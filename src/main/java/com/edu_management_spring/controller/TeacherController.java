package com.edu_management_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {


    @RequestMapping("/teacher")
    public String test() {
        return "teacher.html";
    }

}
