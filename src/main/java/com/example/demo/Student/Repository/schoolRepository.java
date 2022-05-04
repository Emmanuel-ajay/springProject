package com.example.demo.Student.Repository;

import com.example.demo.Student.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface schoolRepository extends JpaRepository<School,Long> {
}
