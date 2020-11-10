package com.bms.api.apibms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bms.api.apibms.entities.Loan;
import com.bms.api.apibms.entities.LoanDetail;
import com.bms.api.apibms.model.LoanService;

@RestController
public class LoanController {

	@Autowired
	LoanService loanService;

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/loan/applyloan")
	public Loan applyLoan(@RequestBody Loan loan, @RequestParam("customerId") long customerId) {
		return loanService.applyLoan(loan, customerId);
	}

	@PostMapping("/loan/loanDetailEntry")
	public LoanDetail applyLoan(@RequestBody LoanDetail loanDetail, @RequestParam("loanId") long loanId) {
		return loanService.loanDetails(loanDetail, loanId);
	}
	
	@GetMapping("/loan/getloanDetails")
	public Loan getCustomer(@RequestParam("customerId") long customerId) {
		return loanService.fetchloanDetails(customerId);
	}
	

}
