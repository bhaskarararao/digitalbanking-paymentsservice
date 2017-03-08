package com.capg.paymentservices.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.paymentservices.model.Merchant;

@Repository
@Transactional
public interface MerchantDao extends CrudRepository<Merchant,Long>
{
	List<Merchant> findAll();
}

