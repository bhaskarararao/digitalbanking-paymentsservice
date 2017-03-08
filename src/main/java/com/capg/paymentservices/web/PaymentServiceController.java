package com.capg.paymentservices.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.paymentservices.model.Biller;
import com.capg.paymentservices.model.Customer;
import com.capg.paymentservices.model.Merchant;
import com.capg.paymentservices.service.PaymentService;

@RestController
@ComponentScan("com.capg.paymentservices")
@CrossOrigin
@EnableAutoConfiguration
public class PaymentServiceController {

	@Autowired
	private PaymentService paymentservice;
	
	@RequestMapping(value="/paymentservices/{customerId}/billers",method = RequestMethod.GET)
	public List<Biller> getAllBillersForCustomer(@PathVariable int customerId)
	{
		  Customer customer=new Customer();
		    customer.setCustomerId(customerId);
		    List<Biller> listBiller=paymentservice.findByCustomer(customer);
		    return listBiller;
	}
	@RequestMapping(value="/paymentservices/merchants",method = RequestMethod.GET)
	public List<Merchant> getAllMerchantssForCustomer()
	{
		    List<Merchant> listMerchant=paymentservice.findAllMerchant();
		    return listMerchant;
	}
	
}
