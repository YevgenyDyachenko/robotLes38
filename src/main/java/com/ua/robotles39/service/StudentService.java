package com.ua.robotles39.service;

import com.ua.robotles39.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    public List<Student> findAll() {
        return List.of(
                new Student("Bob", 20, "Kyiv"),
                new Student("Mark", 21, "London"),
                new Student("Daniil", 22, "Paris"),
                new Student("Tom", 23, "Berlin")
        );
    }

    public Optional<Student> findById(Long id) {
        return Optional.of(new Student("Miko", 19, "London"));
    }

    public void save(Student student) {
        System.out.println(student);
    }
}
