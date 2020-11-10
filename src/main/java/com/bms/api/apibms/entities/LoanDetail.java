package com.bms.api.apibms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class LoanDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long loanId;
	private double courseFee;
	private String course;
	private String fatherName;
	private String fatherOccupation;
	private double annualIncome;
	private String companyName;
	private String designation;
	private float totalExperience;
	private float experienceInCurrentCompany;
	

}
