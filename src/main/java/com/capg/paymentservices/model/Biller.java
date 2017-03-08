package com.capg.paymentservices.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
@Entity
@Table(name="biller")
public class Biller implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name="biller_id")
	private int billerId;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="merchant_id")
	private Merchant merchant;
	
	@Column(name="regd_date")
	private Timestamp regdate;
	
	@Column(name="account_no")
	private long accountno;
	
	@Column(name="Subscriber_id")
	private String Subscriberid;

	public int getBillerId() {
		return billerId;
	}

	public void setBillerId(int billerId) {
		this.billerId = billerId;
	}

	@JsonIgnore
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public long getAccountno() {
		return accountno;
	}

	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}

	public String getSubscriberid() {
		return Subscriberid;
	}

	public void setSubscriberid(String subscriberid) {
		Subscriberid = subscriberid;
	}
}
