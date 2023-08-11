package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Customer;

public interface ICustomerDao extends JpaRepository <Customer, Integer>{
	@Query("select c from Customer c where c.custId= ?1")
	List<Customer> getCustomerById(long custId);
}
