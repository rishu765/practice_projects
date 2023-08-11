package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
//import com.example.demo.entity.Vehicle;
import com.example.demo.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;

    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }
    

    @PostMapping("/add")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createNewCustomer(customer);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<List<Customer>> getCustomerById(@PathVariable long customerId) {
        List<Customer> l = customerService.getCustomerById(customerId);
        return new ResponseEntity<List<Customer>>(l,HttpStatus.OK);
    }

    @GetMapping ("/getall")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

}
