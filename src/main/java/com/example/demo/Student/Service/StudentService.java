package com.example.demo.Student.Service;

import com.example.demo.Student.Repository.StudentRepository;
import com.example.demo.Student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    @Autowired



    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        studentRepository.save(student);

    }

    public void deleteStudent(Long studentId) {
        Boolean exists = studentRepository.existsById(studentId);
        if (!exists){
            throw new IllegalStateException("Student with id " + studentId + "doesn't exist");
        }
        studentRepository.deleteById(studentId);
    }
    @Transactional
    public  void updateStudent(Long studentId, String name, String email) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("student with id" + studentId + "doesn't exist "));
        if( name != null &&
                name.length()> 0 &&
                !Objects.equals(student.getName(),name)){
            student.setName(name);
        }
        if( email != null &&
                email.length()> 0 &&
                !Objects.equals(student.getEmail(),email)){
            Optional<Student> studentOptional = studentRepository.findstudentbyemail(email);
            if(studentOptional.isPresent()){
                throw new IllegalStateException("email taken");
            }
            student.setName(email);
        }
    }
}
