package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.demo.dao.DriverDao;
import com.example.demo.dao.ICustomerDao;
import com.example.demo.entity.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService{
	
	
//	private Customer
	@Autowired
	private ICustomerDao dao;
	
	private List<Customer> customers = new ArrayList<>();

    @Override
    @Transactional
    public Customer createNewCustomer(Customer customer) {
        customer.setCustomerId(customers.size() + 1);
        return dao.save(customer);
    }
    
    @Override
    public List<Customer> getCustomerById(long customerId) {
        return dao.getCustomerById(customerId);
    }
//    @Override
//    public Customer getCustomerById(long customerId) {
//    	for (Customer customer : customers) {
//    		if (customer.getCustomerId() == customerId) {
//    			return customer;
//    		}
//    	}
//    	return null;
//    }

    @Override
    public List<Customer> getAllCustomers() {
        return dao.findAll();
    }

//    @Override
//    public Customer updateCustomer(Customer updatedCustomer) {
//        for (int i = 0; i < customers.size(); i++) {
//            Customer customer = customers.get(i);
//            if (customer.getCustomerId() == updatedCustomer.getCustomerId()) {
//                customers.set(i, updatedCustomer);
//                return updatedCustomer;
//            }
//        }
//        return null;
//    }
}
