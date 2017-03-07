package com.capg.paymentservices.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
@Entity
@Table(name="customer")
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="mobile_no")
	private Integer mobileNo;
	
	@Column(name="email_id")
	private String emailId;
	
	@OneToMany(mappedBy="customer")
	private List<Biller> biller;
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Integer getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public List<Biller> getBiller() {
		return biller;
	}

	public void setLoan(List<Biller> biller) {
		this.biller = biller;
	}

}
