package com.bms.api.apibms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Loan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loanId;
	private long customerId;
	private String loanType;
	private double loanAmount;
	private String loanApplyDate;
	private float rateOfInterest;
	private int loanDuration;
	

}
