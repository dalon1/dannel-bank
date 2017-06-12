package com.dannelbank.app.interfaces;

import com.dannelbank.app.annotations.WrittenBy;
import com.dannelbank.app.models.Customer;
import com.dannelbank.app.models.CreditCard;

@WrittenBy(
		author="Dannel Alon",
		date="01/04/2017",
		comment="Interface provider")
public interface IPayProvider {
	public void start();
	public boolean payCreditCard(Customer cust, CreditCard creditCard);
	public boolean payBill(Customer cust);
	
}
