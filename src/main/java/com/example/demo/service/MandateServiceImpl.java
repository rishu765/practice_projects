package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICustomerDao;
import com.example.demo.dao.IMandateDao;
import com.example.demo.entity.CreateMandateRequest;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Mandate;

@Service
public class MandateServiceImpl implements IMandateService{
	
	@Autowired
	private IMandateDao dao; 
////

//	    @Override
//	    @Transactional
//	    public Mandate createNewMandateId(Mandate mandate) {
//	    	mandate.setMandateId(mandates.size() + 1);
//	        return dao.save(mandate);
//	    }
//	    
		@Override
//		@Transactional
	    public Mandate createMandate(CreateMandateRequest createMandateRequest) {
	    	Mandate mnt = new Mandate();
	    	mnt.setAmt(createMandateRequest.getAmt());
	    	mnt.setCustomerId(createMandateRequest.getCustomerId());
	    	mnt.setEndDate(createMandateRequest.getEndDate());
	    	mnt.setFreq(createMandateRequest.getFrequency());
	    	mnt.setMailId(createMandateRequest.getMailId());
	    	//mnt.setMandateId(createMandateRequest.getMandateId());
	    	mnt.setMaxAmt(createMandateRequest.getMaxAmt());
	    	mnt.setMerchId(createMandateRequest.getMerchantId());
	    	mnt.setMinAmt(createMandateRequest.getMinAmt());
	    	mnt.setPhoneNo(createMandateRequest.getPhoneNo());
	    	mnt.setStartDate(createMandateRequest.getStartDate());
	    	mnt.setSubType(createMandateRequest.getSubType());
//	        mandates.add(mnt);
//	        return mnt;
	    	return dao.save(mnt);
	    }
		
	    @Override
	    public List<Mandate> getAllMandates() {
	        return dao.findAll();
	    }
	    
	    @Override
	    public List<Mandate> getMandateById(long mandateId) {
	        return dao.getMandateById(mandateId);
	    }

//		@Override
//		public List<Mandate> getCustomerMandates(long customerId) {
//			// TODO Auto-generated method stub
//			return null;
//		}

//		@Override
//		public List<Mandate> getCustomerMandates(long customerId) {
//			// TODO Auto-generated method stub
//			return null;
//		}

//	    @Override
//	    public List<Mandate> getCustomerMandates(long customerId) {
//	        List<Mandate> customerMandates = new ArrayList<>();
//	        for (Mandate mandate : mandates) {
//	            if (mandate.getCustid() == customerId) {
//	                customerMandates.add(mandate);
//	            }
//	        }
//	        return customerMandates;
//	    }
}
