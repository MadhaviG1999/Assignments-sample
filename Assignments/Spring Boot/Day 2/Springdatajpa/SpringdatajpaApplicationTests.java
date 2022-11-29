package com.example.springdatajpa;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springdatajpa.model.Student;
import com.example.springdatajpa.repo.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdatajpaApplicationTests {
	
	@Autowired
	private StudentRepository repository;

	@Test
	public void testSaveStudent() {
		Student student = new Student();
		student.setId(1l);
		student.setName("Abhi");
		student.setTestScore(100);
		repository.save(student);
		
		Student savedStudent = repository.findById(1l).get();
		assertNotNull(savedStudent);
		
		
	}

}
