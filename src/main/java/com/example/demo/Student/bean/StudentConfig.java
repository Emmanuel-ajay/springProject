package com.example.demo.Student.bean;

import com.example.demo.Student.Repository.StudentRepository;
import com.example.demo.Student.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student mariam =  new Student(
                    "mariam",
                    LocalDate.of(2000, JANUARY, 5),
                    "mariam@gmail.com"
            );
           Student fred = new Student(
                    "fred",
                    LocalDate.of(2002, JANUARY, 5),
                    "fred@gmail.com"
            );
            repository.saveAll(
                    List.of(mariam , fred)
            );
        };
    }
}
