package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface ICustomerService {

	public Customer createNewCustomer(Customer customer);

	public List<Customer> getCustomerById(long customerId);

	public List<Customer> getAllCustomers();


}
