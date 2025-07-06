package com.practise.crud_practise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.crud_practise.model.Student;
import com.practise.crud_practise.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepo;
	
	public void saveStudent(Student student) {
		studentRepo.save(student);
	}
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}
	public Student getStudentById(Long sId) {
		return studentRepo.getBySId(sId);
	}
	public List<Student> getStudentsByName(String sName) {
		return studentRepo.findBysName(sName);
	}
	public List<Student> getStudentsByDept(String sDept) {
		return studentRepo.findBysDept(sDept);
	}
	public void updateStudentNameById(Long sId, String sName) {
		int res = studentRepo.modifyStudentNameBysId(sId, sName);
		if(res == 0) 
			System.out.println("Id not found in the database");
		else
			System.out.println("Modification Sucessful");
	}
	public void deleteStudentById(Long sId) {
		if(!studentRepo.existsBysId(sId)) {
			System.out.println("Id not found in the database");
		} else {
			studentRepo.deleteBysId(sId);
			System.out.println("Deletion Sucessful");
		}
	}
}
