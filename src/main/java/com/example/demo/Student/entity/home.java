package com.example.demo.Student.entity;

import javax.persistence.*;

@Entity
@Table
public class home {
    @Id
    @SequenceGenerator(
            name = "home_sequence",
            sequenceName = "home_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "home_sequence"
    )

    private Long student_id;
    private String name;
    private String country;
    private String address;
    private String type;




    public home(){}
    public home (String name, String country, String address, String type){
        this.name=name;
        this.country = country;
        this.address= address;
        this.type = type;

    }

    public home(Long student_id, String name, String country, String address, String email, String type) {
        this.student_id = student_id;
        this.name = name;
        this.country = country;
        this.address = address;
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", country=" + country +
                ", address='" + address + '\'' +
                '}';
    }
}
