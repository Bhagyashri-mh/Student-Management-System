package com.demo.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.sms.entity.Student;
import com.demo.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {/*
		Student student1 = new Student("Monika", "Rane", "monikarane@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Virat", "Kohli", "viratkohli@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Ishan", "Kishan", "ishankishan@gmail.com");
		studentRepository.save(student3);*/
	}

}
