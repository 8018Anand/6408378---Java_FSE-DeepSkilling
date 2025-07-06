package com.practise.crud_practise;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

import com.practise.crud_practise.model.Student;
import com.practise.crud_practise.service.StudentService;

@SpringBootApplication
@EntityScan("com.practise.crud_practise.model")
public class CrudPractiseApplication {
	public static StudentService stdService;
	static void testAdd(Student sd) {
		stdService.saveStudent(sd);
	}
	static void testFindAll() {
		List<Student> students = stdService.getAllStudents();
		int n = students.size();
		for(int i = 0; i < n; i++) {
			System.out.println(students.get(i).toString());
		}
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(CrudPractiseApplication.class, args);
		stdService = context.getBean(StudentService.class);
		testFindAll();
	}

}
