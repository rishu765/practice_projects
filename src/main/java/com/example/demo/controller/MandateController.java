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

import com.example.demo.entity.CreateMandateRequest;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Mandate;
import com.example.demo.service.IMandateService;
import com.example.demo.service.MandateServiceImpl;

@RestController
@RequestMapping("/mandate")
public class MandateController {
	
	@Autowired
	private MandateServiceImpl mandateService;

    @PostMapping("/add")
    public Mandate createMandate(@RequestBody CreateMandateRequest mandate) {
       return mandateService.createMandate(mandate);
    }
    
    @GetMapping ("/getall")
    public List<Mandate> getAllMandates() {
        return mandateService.getAllMandates();
    }

    @GetMapping("/{mandateId}")
    public ResponseEntity<List<Mandate>> getMandateById(@PathVariable long mandateId) {
        List<Mandate> l = mandateService.getMandateById(mandateId);
        return new ResponseEntity<List<Mandate>>(l,HttpStatus.OK);
    }
//    
//    @GetMapping("/customer/{customerId}")
//    public ResponseEntity<List<Mandate>> getCustomerMandates(@PathVariable long customerId) {
//        List<Mandate> customerMandates = mandateService.getCustomerMandates(customerId);
//        return new ResponseEntity<>(customerMandates, HttpStatus.OK);
//    }


}
