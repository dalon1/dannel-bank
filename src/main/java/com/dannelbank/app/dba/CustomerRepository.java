package com.dannelbank.app.dba;

import java.util.*;
import com.dannelbank.app.annotations.WrittenBy;
import com.dannelbank.app.models.Customer;

/**
 * Customer Repository Class.
 * Simulate a fake Database. Only for convenience purposes.
 * @author AloniD
 */
@WrittenBy(
		author="Dannel Alon",
		date="26/03/2017",
		comment="Simulate a fake Database. XML templates will replace this soon.")
public class CustomerRepository {

	private static ArrayList<Customer> listCust = new ArrayList<Customer>() {{
		add(new Customer("Dannel", "Alon", "dalon@cibc.com", "dalon"));
		add(new Customer("Joel", "Alon", "joel@gmail.com", "password"));
		add(new Customer("Eitan", "Alon", "eitan@gmail.com", "password"));
		add(new Customer("Cloe", "Alonita", "cloe@gmail.com", "cloe64"));
	}};
	
	public static List<Customer> getCustomers() {
		return listCust;
	}
}
