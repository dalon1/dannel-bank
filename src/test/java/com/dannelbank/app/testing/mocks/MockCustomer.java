package com.dannelbank.app.testing.mocks;

import com.dannelbank.app.models.Customer;
import com.dannelbank.app.models.CustomerName;
import com.dannelbank.app.annotations.WrittenBy;

@WrittenBy(
		author="Dannel Alon",
		date="26/03/2017",
		comment="For JUnit testing purposes")
public class MockCustomer {
	private Customer regCustomer = mockCustomer("Dannel", "Alon", "dalon@cibc.com", "dalon");
	private Customer nonRegCustomer = mockCustomer("Pepito", "Juanito", "pepito@popo.com", "pepito123");
	
	public Customer getRegisteredCustomer() {
		return regCustomer;
	}
	
	public Customer getNonRegisteredCustomer() {
		return nonRegCustomer;
	}
	
	private Customer mockCustomer(String firstName, String lastName, String emailAddress, String password) {
		Customer customer = new Customer();
		CustomerName customerName = new CustomerName();
		customerName.setFirstName(firstName);
		customerName.setLastName(lastName);
		customer.setCustomerName(customerName);
		customer.setEmailAddress(emailAddress);
		customer.setPassword(password);
		return customer;
	}
}
