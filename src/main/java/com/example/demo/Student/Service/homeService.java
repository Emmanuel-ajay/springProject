package com.example.demo.Student.Service;

import com.example.demo.Student.Repository.homeRepository;
import com.example.demo.Student.entity.home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class homeService {
    private final homeRepository homerepository;
    public homeService(homeRepository homerepository)
    {
        this.homerepository  = homerepository;
    }

    @Autowired
    public List<home> gethome(){
        return homerepository.findAll();
    }

}
