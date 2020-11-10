package com.bms.api.apibms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bms.api.apibms.entities.Customer;
import com.bms.api.apibms.model.Account;
import com.bms.api.apibms.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/customer/registration")
	public Customer customerRegistration(@RequestBody Customer customer) {
		return customerService.registerCustomer(customer);
	}
	
	@PostMapping("/customer/deposit")
	public Account accountDeposit(@RequestBody Account account) {
		return customerService.deposit(account);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/customer/getCustomer")
	public Customer getCustomer(@RequestParam("username") String username) {
		return customerService.fetchCustomer(username);
	}

}
