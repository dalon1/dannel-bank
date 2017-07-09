package com.dannelbank.app.interfaces;

import java.util.Scanner;
import com.dannelbank.app.models.Customer;

public interface IAuthenticationProvider {
	public void printAuthenticPanel();
	public String printScan(String prompt, Scanner scan);
	public void authenticate();
	public Customer retrieveCustomer();
	public void printAuthenticResult();
	public void printNotFoundCustomerMessage();
}
