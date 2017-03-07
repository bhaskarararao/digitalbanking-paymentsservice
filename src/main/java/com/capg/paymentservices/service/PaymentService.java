package com.capg.paymentservices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.paymentservices.model.Biller;
import com.capg.paymentservices.model.Customer;

@Service
public interface PaymentService {
	
	public List<Biller> findByCustomer(Customer customer);
	
}
