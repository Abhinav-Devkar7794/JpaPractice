package com.axelor.embeddable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Employee {
	
	@Id
	int eid;
	String employeeDesignation;	
	@ElementCollection
	List<FullName> fullName=new ArrayList<FullName>();

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public List<FullName> getFullName() {
		return fullName;
	}
	public void setFullName(List<FullName> fullName) {
		this.fullName = fullName;
	}
	
}
