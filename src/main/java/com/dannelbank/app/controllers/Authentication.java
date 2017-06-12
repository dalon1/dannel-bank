package com.dannelbank.app.controllers;

import com.dannelbank.app.annotations.WrittenBy;
import com.dannelbank.app.models.Customer;
import com.dannelbank.app.dba.CustomerRepository;
import java.util.Scanner;


/**
 * Authentication Class - User
 * Date: 
 * @author AloniD
 *
 */
@WrittenBy(
		author="Dannel",
		date="04/03/2017",
		comment="User should be authenticated")
public class Authentication {
	private final int MAX_TRIALS = 3;
	
	private int numTrials = MAX_TRIALS;
	private boolean isAuthentic = false;
	private String username;
	private String password;
	private Customer authenticCust;
	
	public Authentication() {
		// no body
	}
	
	public boolean getIsAuthentic() {
		return isAuthentic;
	}

	public void setAuthentic(boolean isAuthentic) {
		this.isAuthentic = isAuthentic;
	}

	public Customer getAuthenticCust() {
		return authenticCust;
	}
	
	public void setAuthenticCust(Customer authenticCust) {
		this.authenticCust = authenticCust;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	private void printAuthenticPanel() {
		Scanner scan = new Scanner(System.in);
		setUsername(printScan("username", scan));
		setPassword(printScan("password", scan));
	}
	
	// ** Change method name later
	private String printScan(String prompt, Scanner scan) {
		System.out.printf("%s:",prompt);
		String in = scan.next();
		// InputValidation
		return in;
	}
	
	// + Authentication method
	public void authenticate() {
		do {
			printAuthenticPanel();
			retrieveCustomer();
			printAuthenticResult();
			printNotFoundCustMsg();
		
			// Number of trials is being subtracted in the 
			// ... do-while loop condition
		} while(!this.isAuthentic && this.numTrials > 0); 
	}
	
	public void retrieveCustomer() {
		// implement authentication
		for (Customer cust : CustomerRepository.getCustomers()) {
			if (cust.getEmail().equals(getUsername()) &&
					cust.getPassword().equals(getPassword())) {
				this.isAuthentic = true;
				setAuthenticCust(cust);
				break;
			}	
		}
	}
	
	private void printAuthenticResult() {
		// printing results of the authentication
		final int LIMIT = 3;
		
		try {
			for (int i = 0; i < LIMIT; i++) {
				Thread.sleep(1000);
				System.out.printf("Validating...(%d)\n", i + 1);
			}
		} catch(Exception ex) {}
	}
	
	// Error Message if customer is not found.
	private void printNotFoundCustMsg() {
		if (!this.isAuthentic) {
			
			String str = "\nCustomer not found.\n";
			str += String.format("Please, try again (%d)\n", --this.numTrials);
			
			System.out.println(str);
		}
	}
	
}
