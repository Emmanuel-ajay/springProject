package com.example.demo.Student.bean;

import com.example.demo.Student.Repository.StudentRepository;
import com.example.demo.Student.Repository.schoolRepository;
import com.example.demo.Student.entity.School;
import com.example.demo.Student.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class schoolConfig {
    @Bean
    CommandLineRunner commandLineRun(schoolRepository repository){
        return args -> {
            School Cu =  new School(
                    "Cu",
                    "ota",
                    "cu@gmail.com"

            );
            School bells = new School(
                    "Bells",
                   "ogun",
                    "bells@gmail.com"
            );
            repository.saveAll(
                    List.of(Cu,bells)
            );
        };
    }
}
