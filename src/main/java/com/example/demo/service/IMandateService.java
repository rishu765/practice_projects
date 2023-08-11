package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CreateMandateRequest;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Mandate;

public interface IMandateService {
	
//	public default void Mandate(){}

//	Mandate createMandate(CreateMandateRequest mandate);

//	List<Mandate> getCustomerMandates(long customerId);

	Mandate createMandate(CreateMandateRequest createMandateRequest);
	
	public List<Mandate> getAllMandates();

	public List<Mandate> getMandateById(long mandateId);
	
	

}
