package com.practise.crud_practise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.practise.crud_practise.model.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	public Student getBySId(Long sId);
	public boolean existsBysId(Long sId);

	//All the function that we want to try on database
	public List<Student> findBysName(@Param("sName") String sName);
	
	public List<Student> findBysDept(@Param("sDept") String sDept);
	
	@Modifying
	@Transactional
	@Query("UPDATE Student s SET s.sName = :sName WHERE s.sId = :sId")
	int modifyStudentNameBysId(@Param("sId") Long sId, @Param("sName") String sName); //this will return the no of rows effected. doesn't throw any exception
	
	@Modifying
	@Transactional
	int deleteBysId(@Param("sId") Long sId); //this will return the no of rows effected. will throw an exception
	//if no row was found with the id so then it will throw exception so we have to handle that at service class like before deleting check weather that particular id even exist or not.		


}
