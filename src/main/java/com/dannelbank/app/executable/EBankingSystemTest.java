package com.dannelbank.app.executable;

import com.dannelbank.app.annotations.WrittenBy;
import com.dannelbank.app.controllers.Authentication;
import com.dannelbank.app.controllers.EBankingSystem;

import java.util.Date;

@WrittenBy(
		author="Dannel",
		date="03/03/2017")
public class EBankingSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Authentication auth = new Authentication();
	
		auth.authenticate();

		
		if (auth.getIsAuthentic()) 
		{
			EBankingSystem sys = new EBankingSystem(auth.getAuthenticCust());
			sys.Start();
		}
	}
	
}
