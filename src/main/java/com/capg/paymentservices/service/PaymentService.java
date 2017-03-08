package com.capg.paymentservices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.paymentservices.model.Biller;
import com.capg.paymentservices.model.Customer;
import com.capg.paymentservices.model.Merchant;

@Service
public interface PaymentService {
	
	public List<Biller> findByCustomer(Customer customer);
	public List<Merchant> findAllMerchant();
	
}
