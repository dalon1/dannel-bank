package com.dannelbank.app.testing.mocks;

import com.dannelbank.app.models.Customer;
import com.dannelbank.app.annotations.*;

@WrittenBy(
		author="Dannel Alon",
		date="26/03/2017",
		comment="For JUnit testing purposes")
public class MockCustomer {
	private Customer regCustomer = new Customer("Dannel", "Alon", "dalon@cibc.com", "dalon");
	private Customer nonRegCustomer = new Customer("Pepito", "Juanito", "pepito@popo.com", "pepito123");
	
	public Customer getRegisteredCustomer() {
		return regCustomer;
	}
	
	public Customer getNonRegisteredCustomer() {
		return nonRegCustomer;
	}
}
