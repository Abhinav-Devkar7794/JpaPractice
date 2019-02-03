package com.axelor.jpademo;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	int id;
	String studentName;
	
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Student() {
		super();
	}
	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getId() {
		return id;
	}
	
	
	
}
