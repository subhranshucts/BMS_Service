package com.bms.api.apibms.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.api.apibms.entities.Loan;
import com.bms.api.apibms.entities.LoanDetail;
import com.bms.api.apibms.repository.LoanDetailRepository;
import com.bms.api.apibms.repository.LoanRepository;

@Service
public class LoanService {
	
	@Autowired
	LoanRepository loanRepository;
	
	@Autowired
	LoanDetailRepository loanDetailRepository;
	
	public Loan applyLoan(Loan loan, long customerId) {
		loan.setCustomerId(customerId);
		loanRepository.save(loan);
		return loan;
	}

	public LoanDetail loanDetails(LoanDetail loanDetail, long loanId) {
		loanDetail.setLoanId(loanId);
		loanDetailRepository.save(loanDetail);
		return loanDetail;
	}
	
	public Loan fetchloanDetails(long customerId) {
		return loanRepository.findByCustomerId(customerId);
	}

}
