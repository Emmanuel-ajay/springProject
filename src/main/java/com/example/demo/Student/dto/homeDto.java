package com.example.demo.Student.dto;

public class homeDto {

    private Long id;
    private String name;
    private String country;
    private String address;
    private String type;

    public homeDto(Long id, String name, String country, String address, String email, String type) {
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
