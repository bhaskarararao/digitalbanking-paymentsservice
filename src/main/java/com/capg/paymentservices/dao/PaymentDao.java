package com.capg.paymentservices.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.paymentservices.model.Biller;
import com.capg.paymentservices.model.Customer;

@Repository
@Transactional
public interface PaymentDao extends CrudRepository<Biller,Long>
{
	public List<Biller> findByCustomer(Customer customer);
}
