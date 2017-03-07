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
@Table(name="merchants")
public class Merchant implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name="merchant_id")
	private int merchantId;
	
	@Column(name="category")
	private String category;
	
	@Column(name="service_provider")
	private String provider;
	
	@OneToMany(mappedBy="merchant")
	private List<Biller> biller;

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public List<Biller> getBiller() {
		return biller;
	}

	public void setBillers(List<Biller> biller) {
		this.biller = biller;
	}

}
