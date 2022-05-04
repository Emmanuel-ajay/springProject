package com.example.demo.Student.Controller;

import com.example.demo.Student.Service.schoolService;
import com.example.demo.Student.entity.School;
import com.example.demo.Student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/school")
public class schoolController {
    private final schoolService schoolservice;
    @Autowired
    public schoolController(schoolService schoolservice) {
        this.schoolservice = schoolservice;
    }

    @GetMapping
    public List<School> getschool(){
        return schoolservice.getSchools();

    }
    }

