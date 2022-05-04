package com.example.demo.Student.bean;

import com.example.demo.Student.Repository.homeRepository;
import com.example.demo.Student.Repository.schoolRepository;
import com.example.demo.Student.entity.School;
import com.example.demo.Student.entity.home;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class homeConfig {
    @Bean
    CommandLineRunner commandLineRunn(homeRepository repository){
        return args -> {
            home first =  new home(
                    "Mariam",
                    "Nigeria",
                    "lekki",
                    "duplex"

            );
            home sec = new home(
                    "fred",
                    "Nigeria",
                    "ikeja",
                    "flat"
            );
            repository.saveAll(
                    List.of(first,sec)
            );
        };
    }

}
