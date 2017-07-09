package com.dannelbank.app.controllers;

import com.dannelbank.app.providers.AuthenticationProvider;
import com.dannelbank.app.models.Authentication;

public class AuthenticationController {
	public void start() {
		Authentication authentication = new Authentication();
		AuthenticationProvider provider = new AuthenticationProvider();
		// TODO embed authentication class
		provider.authentication = authentication; 
		provider.authenticate();
		
		if (authentication.getIsAuthentic()) 
		{
			EBankingSystem sys = new EBankingSystem(authentication.getAuthenticCust());
			sys.Start();
		}
	}
}

