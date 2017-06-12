package com.dannelbank.app.models;

import com.dannelbank.app.annotations.*;
/**
 * Latest edition date: 06/02/17
 * Customer Class
 * @author AloniD
 * 
 */
@WrittenBy(
		author="Dannel",
		date="19/03/2017")
public class Customer {
	//TODO implement interface for customer behaviour
	
	/*
	 * >> Attributes
	 * */
	
	private int id;
	private String fName;
	private String lName;
	private String email;
	private String password = "banking";
	private String phone;
	private Address address;
	private BankAccount bankAccount;
	private DebitCard debitCard;
	private CreditCard creditCard;
	private boolean isSigned = false;
	
	/*
	 * >> Properties
	 * */
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	public DebitCard getDebitCard() {
		return debitCard;
	}
	public void setDebitCard(DebitCard debitCard) {
		this.debitCard = debitCard;
	}
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isSigned() {
		return isSigned;
	}
	public void setSigned(boolean isSigned) {
		this.isSigned = isSigned;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*
	 * >> Instance Methods
	 * */
	
	/*
	 * >> Constructor(s)
	 * */
	// All required + optional fields: old customer.
	public Customer(String valFName, String valLName, String valEmail,
			String valPassword,
			String valPhone, Address valAddress, BankAccount valBankAcc, 
			DebitCard valDebitCard, CreditCard valCreditCard) {
		setfName(valFName);
		setlName(valLName);
		setEmail(valEmail);
		setPassword(valPassword);
		setPhone(valPhone);
		setAddress(valAddress);
		setBankAccount(valBankAcc);
		setDebitCard(valDebitCard);
		setCreditCard(valCreditCard);
		// Generate ID here >>
		// ....
	}
	
	// All required fields: old customer.
	public Customer(String valfName, String vallName, String valEmail,
			String valPassword, BankAccount valBankAcc) {
		this(valfName, vallName, valEmail, valPassword,null,
				null, valBankAcc, null, null);
	}
	
	// All required fields: new customer.
	public Customer(String valfName, String vallName, String valEmail,
			String valPassword) {
		this(valfName, vallName, valEmail, valPassword, 
				null, null, null, null, null);
	}
	
	// All essential fields: new customer with nothing.
	public Customer(String valfName, String vallName) {
		this(valfName, vallName, null, null, null,
				null, null, null, null);
	}
	
	public Customer() {
		// No Body
		this(null, null,  null, null, null, null, null, null, null);
	}
	
	
	
}
