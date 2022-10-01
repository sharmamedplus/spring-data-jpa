package com.spring.data.jpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.data.jpa.entity.Guardian;
import com.spring.data.jpa.entity.Student;

@SpringBootTest
public class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void saveStudent() {
		Guardian guardian = Guardian.builder()
							.mobile("8888888888")
							.name("Ramashish-2")
							.email("ramashish2@email.com")
							.build();
		
		Student student = Student.builder()
							.emailId("Vijay2@gmail.com")
							.firstName("Vijay2")
							//.guardianEmail("Ramashish@gmail.com")
							//.guardianMobile("9999999999")
							//.guardianName("Ramashish")
							.lastName("Sharma")
							.guardian(guardian)
							.build();
		studentRepository.save(student);
	}
}
