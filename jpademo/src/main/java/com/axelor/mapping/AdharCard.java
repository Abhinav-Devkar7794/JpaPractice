package com.axelor.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdharCard {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	long adharCardNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAdharCardNo() {
		return adharCardNo;
	}
	public void setAdharCardNo(long adharCardNo) {
		this.adharCardNo = adharCardNo;
	}
	
	
	
	
}
