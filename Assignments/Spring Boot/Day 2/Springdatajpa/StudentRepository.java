package com.example.springdatajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatajpa.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}