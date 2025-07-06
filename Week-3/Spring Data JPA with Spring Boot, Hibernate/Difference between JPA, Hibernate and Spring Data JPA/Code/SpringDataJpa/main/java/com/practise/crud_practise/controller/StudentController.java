package com.practise.crud_practise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practise.crud_practise.model.Student;
import com.practise.crud_practise.service.StudentService;



@RestController
@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService stuSer;

	@GetMapping
	List<Student> allStudents() {
		return stuSer.getAllStudents();
	}
	@PostMapping
	void saveStudent(@RequestBody Student s) {
		stuSer.saveStudent(s);
	}
	@GetMapping
	@RequestMapping("/{id}")
//	Student findStudent(Long id) {
//		return 
//	}
}	
