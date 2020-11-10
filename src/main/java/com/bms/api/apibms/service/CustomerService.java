package com.bms.api.apibms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.api.apibms.entities.Customer;
import com.bms.api.apibms.model.Account;
import com.bms.api.apibms.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public Customer registerCustomer(Customer customer) {
		if (customerRepository.findByUsername(customer.getUsername()) == null) {
			customer.setBalance(customer.getInitialDepositAmount());
			return customerRepository.save(customer);
		}
		return null;
	}

	public Customer fetchCustomer(String username) {
		return customerRepository.findByUsername(username);
	}

	public Account deposit(Account account) {
		Optional<Customer> CustomerOptional = customerRepository.findById(account.getCustomerId());
		if (CustomerOptional.isPresent()) {
			Customer customer = CustomerOptional.get();
			if (account.getAmount() > 0) {
				double balance = customer.getBalance();
				balance = balance + account.getAmount();
				customer.setBalance(balance);
				account.setBalance(balance);
				account.setAccountType(customer.getAccountType());
				customerRepository.save(customer);
				return account;
			}
		}
		return null;
	}

}
