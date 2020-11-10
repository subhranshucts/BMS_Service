package com.bms.api.apibms.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String username;
	private String password;
	private String address;
	private String country;
	private String state;
	private String email;
	private int contact;
	private String birthdate;
	private String accountType;
	private String branch;
	private double initialDepositAmount;
	private double balance;
	private String identificationProofType ;
	private String identificationDocumenNo;
}
