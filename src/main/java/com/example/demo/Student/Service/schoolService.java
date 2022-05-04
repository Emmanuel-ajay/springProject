package com.example.demo.Student.Service;

import com.example.demo.Student.Repository.schoolRepository;
import com.example.demo.Student.entity.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class schoolService {
    private final schoolRepository schoolrepository;

    public schoolService(schoolRepository schoolrepository) {
        this.schoolrepository = schoolrepository;
    }
    @Autowired
    public List<School> getSchools (){
        return  schoolrepository.findAll();
    }

}
