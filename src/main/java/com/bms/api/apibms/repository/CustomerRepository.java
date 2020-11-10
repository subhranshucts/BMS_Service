package com.bms.api.apibms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.api.apibms.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	public Customer findByUsername(String username);

}
