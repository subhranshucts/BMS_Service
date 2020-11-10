package com.bms.api.apibms.model;

import lombok.Data;

@Data
public class Account {
	
	private long customerId;
	private String AccountType;
	private double amount;
	private double balance;
	

}
