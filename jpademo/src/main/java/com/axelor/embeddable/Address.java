package com.axelor.embeddable;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	
	String line1;
	String city;
	
	
	public Address() {
		super();
	}


	public Address(String line1, String city) {
		super();
		this.line1 = line1;
		this.city = city;
	}
}
