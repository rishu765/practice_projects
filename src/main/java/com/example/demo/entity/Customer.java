package com.example.demo.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="customer_det")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name="seq", sequenceName="seq", initialValue=100001, allocationSize=1)	
	
	private long custId;
	
	@Column(name="CustomerName")
	private String name;
	
//	@Column(name="CustomerId")
	
	public Customer(){}
	
//	@OneToMany
	@Column(name="mandateId")
	private String mandateId;

	public Customer(String name, long custId, String mandateId) {
		super();
		this.name = name;
		this.custId = custId;
		this.mandateId = mandateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCustomerId() {
		return custId;
	}

	public void setCustomerId(int custId) {
		this.custId = custId;
	}

	public String getMandateId() {
		return mandateId;
	}

	public void setMandateId(String mandateId) {
		this.mandateId = mandateId;
	}

//	public void setCustomerId(int i) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public long getCustomerId() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	
}
