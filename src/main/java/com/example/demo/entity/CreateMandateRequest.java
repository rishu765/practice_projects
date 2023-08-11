package com.example.demo.entity;

import java.util.Date;

public class CreateMandateRequest {
    private int mandateId;
    private int customerId;
    private String subType;
    private int amt;
    private int minAmt;
    private int maxAmt;
    private Date startDate;
    private Date endDate;
    private int frequency;
    private int phoneNo;
    private String mailId;
    private int merchantId;
    
    
	public int getMandateId() {
		return mandateId;
	}
	public void setMandateId(int mandateId) {
		this.mandateId = mandateId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public int getMinAmt() {
		return minAmt;
	}
	public void setMinAmt(int minAmt) {
		this.minAmt = minAmt;
	}
	public int getMaxAmt() {
		return maxAmt;
	}
	public void setMaxAmt(int maxAmt) {
		this.maxAmt = maxAmt;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
    
    
}
