package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Invoice {
	
	@Id
	private String invoiceId;
//	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@ManyToOne
	@JoinColumn(name="custId")
	private Customer custid;
	
//	@Column(name="InvoiceId")
//	private String invoiceId;
	
//	@Column(name="CustomerId")
//	private int custId;
	
	@Column(name="Amount")
	private int amt;
	
	
	@Column(name="Description")
	private String desc;
	
	@Column(name="mandateId")
	private String mandateId;

	@Column(name="merchantID")
	private int merchID;
	
	@Column(name="Status")
	private String status;

	public Invoice(String invoiceId, Customer custId, int amt, String desc, String mandateId, int merchID, String status) {
		super();
		this.invoiceId = invoiceId;
		this.custid = custId;
		this.amt = amt;
		this.desc = desc;
		this.mandateId = mandateId;
		this.merchID = merchID;
		this.status = status;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Customer getCustId() {
		return custid;
	}

	public void setCustId(Customer custId) {
		this.custid = custId;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getMandateId() {
		return mandateId;
	}

	public void setMandateId(String mandateId) {
		this.mandateId = mandateId;
	}

	public int getMerchID() {
		return merchID;
	}

	public void setMerchID(int merchID) {
		this.merchID = merchID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
