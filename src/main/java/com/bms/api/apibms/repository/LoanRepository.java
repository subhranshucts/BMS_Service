package com.bms.api.apibms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.api.apibms.entities.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long>{
	
	public Loan findByCustomerId(long customerId);

}
