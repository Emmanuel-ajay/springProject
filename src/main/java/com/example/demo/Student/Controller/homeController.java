package com.example.demo.Student.Controller;

import com.example.demo.Student.Service.homeService;
import com.example.demo.Student.entity.home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/home")
public class homeController {
    private final homeService homeservice;
    @Autowired
    public homeController(homeService homeservice)  {
        this.homeservice  = homeservice;
    }
    @GetMapping
    public List<home> gethome(){
        return homeservice.gethome();
    }
}
