package com.practise.crud_practise.model;

import jakarta.persistence.*;
import java.time.LocalDate;



@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@Column(name = "s_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sId;
	
	@Column(name = "s_name", unique = true, nullable = false)
	private String sName;
	
	@Column(name = "s_phno", nullable = false)
	private String sPhno;
	
	@Column(name = "s_dob")
	private LocalDate sDob;
	
	@Column(name = "s_dept", nullable = false)
	private String sDept;

	public long getsId() {
		return sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPhno() {
		return sPhno;
	}

	public void setsPhno(String sPhno) {
		this.sPhno = sPhno;
	}

	public LocalDate getsDob() {
		return sDob;
	}

	public void setsDob(LocalDate sDob) {
		this.sDob = sDob;
	}

	public String getsDept() {
		return sDept;
	}

	public void setsDept(String sDept) {
		this.sDept = sDept;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sPhno=" + sPhno + ", sDept=" + sDept + "]";
	}
	
	
	
}
