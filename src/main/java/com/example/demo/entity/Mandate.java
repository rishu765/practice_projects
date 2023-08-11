package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="mandate_det")
public class Mandate {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name="seq", sequenceName="mandate_seq",  allocationSize=1)
	@Column(name="mandateId")
	private long mandateId;
	
//	@ManyToOne
	@JoinColumn(name="CustomerId")
	private int customerId;
	
	@Column(name="SubscriptionType")    // amount type - fixed or variable
	private String subType;
	
	@Column(name="Amount")
	private int amt;
	
	@Column(name="MinAmount")
	private int minAmt;
	
	@Column(name="MaxAmount")
	private int maxAmt;
	
	@Column(name="StartDate")
	private Date startDate;
	
	@Column(name="EndDate")
	private Date endDate;
	
	@Column(name="Frequency")
	private int freq;
	
	@Column(name="PhoneNo")
	private int phoneNo;
	
	@Column(name="MailId")
	private String mailId;
	
	@Column(name="MerchantId")
	private int merchId;

	public Mandate(int mandateId, int custid, String subType, int amt, int minAmt, int maxAmt, Date startDate,
			Date endDate, int freq, int phoneNo, String mailId, int merchId) {
		super();
		this.mandateId = mandateId;
		this.customerId = custid;
		this.subType = subType;
		this.amt = amt;
		this.minAmt = minAmt;
		this.maxAmt = maxAmt;
		this.startDate = startDate;
		this.endDate = endDate;
		this.freq = freq;
		this.phoneNo = phoneNo;
		this.mailId = mailId;
		this.merchId = merchId;
	}

	public Mandate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mandate(long customerId, String source) {
		// TODO Auto-generated constructor stub
	}

	public long getMandateId() {
		return mandateId;
	}

	public void setMandateId(long mandateId) {
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
		return endDate;}


	public void setEndDate(Date date) {
		this.endDate = date;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
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

	public void setMailId(String string) {
		this.mailId = string;
	}

	public int getMerchId() {
		return merchId;
	}

	public void setMerchId(int merchId) {
		this.merchId = merchId;
	}


	
}
