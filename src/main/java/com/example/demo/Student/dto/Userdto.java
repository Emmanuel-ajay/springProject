package com.example.demo.Student.dto;

import javax.persistence.Column;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.Period;

public class Userdto {
    private Long id;
    @NotNull(message = "name can't be empty")
    @Size(min = 3, max = 15, message = "Name should be  between 3-15 characters")
    private String name;
    @NotNull(message = "dob can't be empty")
    private LocalDate dob;
    @Transient
    private Integer age;
    @NotNull(message = "email can't be empty")
    @Email(message = "Email has to be in correct format")
    private String email;

    public Userdto() {
    }

    public Userdto(Long id,
                   String name,
                   LocalDate dob,

                   String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;

        this.email = email;
    }

    public Userdto(String name,
                   LocalDate dob,

                   String email) {
        this.name = name;
        this.dob = dob;

        this.email = email;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Integer getAge() {
        return Period.between(this.dob,LocalDate.now()).getYears();
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
