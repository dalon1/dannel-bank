package com.dannelbank.app.testing;

import com.dannelbank.app.controllers.Authentication;
import com.dannelbank.app.testing.mocks.*;
import junit.framework.Assert;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

public class EBankingGeneralTest {

	MockCustomer mockCustomer = new MockCustomer();
	@Test
	@Ignore
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void authenticateRegisteredCustomer() {
		Authentication auth = new Authentication();
		auth.setUsername(mockCustomer.getRegisteredCustomer().getEmail());
		auth.setPassword(mockCustomer.getRegisteredCustomer().getPassword());
		auth.retrieveCustomer();
		Assert.assertEquals(true, auth.getIsAuthentic());
		Assert.assertNotNull(auth.getAuthenticCust());
	}
	
	@Test
	public void authenticateNonRegisteredCustomer() {
		Authentication auth = new Authentication();
		auth.setUsername(mockCustomer.getNonRegisteredCustomer().getEmail());
		auth.setPassword(mockCustomer.getRegisteredCustomer().getPassword());
		auth.retrieveCustomer();
		Assert.assertEquals(false, auth.getIsAuthentic());
		Assert.assertNull(auth.getAuthenticCust());
	}
}
